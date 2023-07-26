package com.franciscocasiano.monkmod.entity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ItemStackParticleEffect;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;

import static com.franciscocasiano.monkmod.MonkMod.THROWING_STAR;
import static com.franciscocasiano.monkmod.MonkMod.THROWING_STAR_ENTITY;

public class ThrowingStarEntity extends ThrownItemEntity {
    public ThrowingStarEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public ThrowingStarEntity(World world, LivingEntity owner) {
        super(THROWING_STAR_ENTITY, owner, world);
    }

    public ThrowingStarEntity(World world, double x, double y, double z) {
        super(THROWING_STAR_ENTITY, x, y, z, world);
    }

    @Override
    protected Item getDefaultItem() {
        return THROWING_STAR;
    }

    @Environment(EnvType.CLIENT)
    private ParticleEffect getParticleParameters() {
        ItemStack itemStack = this.getItem();
        return itemStack.isEmpty() ? ParticleTypes.ASH : new ItemStackParticleEffect(ParticleTypes.ITEM, itemStack);
    }

    @Environment(EnvType.CLIENT)
    public void handleStatus(byte status) {
        if (status == 3) {
            ParticleEffect particleEffect = this.getParticleParameters();

            for (int i = 0; i < 8; ++i) {
                this.world.addParticle(particleEffect, this.getX(), this.getY(), this.getZ(), 0.0D, 0.0D, 0.0D);
            }
        }

    }

    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        int dmgAmount = 1;
        entity.damage(DamageSource.thrownProjectile(this, this.getOwner()), (float) dmgAmount);

//        Make a sound if a living entity is hit
        if (entity instanceof LivingEntity) {
            this.playSound(SoundEvents.BLOCK_ANVIL_HIT, 1.0F, 1.2F);
            if (entity instanceof PlayerEntity) {
                this.playSound(SoundEvents.ENTITY_ARROW_HIT_PLAYER, 1.0F, 1.2F);
            }
        }
    }

    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if (!this.world.isClient) {
            this.world.sendEntityStatus(this, (byte) 3);
            this.kill();
        }

    }
}

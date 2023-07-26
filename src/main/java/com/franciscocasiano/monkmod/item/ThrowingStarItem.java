package com.franciscocasiano.monkmod.item;

import com.franciscocasiano.monkmod.entity.ThrowingStarEntity;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ThrowingStarItem extends Item {

    public static final Item INSTANCE = new ThrowingStarItem(new FabricItemSettings().maxCount(16).group(ItemGroup.COMBAT));

    public ThrowingStarItem(Settings settings) {
        super(settings);
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack itemStack = player.getStackInHand(hand);
        world.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.ENTITY_EGG_THROW, SoundCategory.NEUTRAL, 0.5F, 1F);
        if (!world.isClient) {
            ThrowingStarEntity thrwStarEntity = new ThrowingStarEntity(world, player);
            thrwStarEntity.setItem(itemStack);
            thrwStarEntity.setVelocity(player, player.getPitch(), player.getYaw(), 0.0F, 2.5F, 0.8F);
            world.spawnEntity(thrwStarEntity);
        }

        player.incrementStat(Stats.USED.getOrCreateStat(this));
        if (!player.getAbilities().creativeMode) {
            itemStack.decrement(1);
        }

        return TypedActionResult.success(itemStack, world.isClient());
    }
}

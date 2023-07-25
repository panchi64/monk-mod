package com.franciscocasiano.monkmod.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class QuarterstaffItem implements ToolMaterial  {

    public static final QuarterstaffItem INSTANCE = new QuarterstaffItem();

    @Override
    public int getDurability() {
        return 500;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 2.0F;
    }

    @Override
    public float getAttackDamage() {
        return 0F;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(
                Items.STRIPPED_ACACIA_LOG,
                Items.STRIPPED_BIRCH_LOG,
                Items.STRIPPED_DARK_OAK_LOG,
                Items.STRIPPED_JUNGLE_LOG,
                Items.STRIPPED_OAK_LOG,
                Items.STRIPPED_SPRUCE_LOG,
                Items.STRIPPED_MANGROVE_LOG,
                Items.STRIPPED_CRIMSON_STEM,
                Items.STRIPPED_WARPED_STEM
        );
    }
}

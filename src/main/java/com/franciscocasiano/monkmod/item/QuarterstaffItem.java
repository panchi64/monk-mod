package com.franciscocasiano.monkmod.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import static com.franciscocasiano.monkmod.data.ItemTagGenerator.STRIPPED_LOGS_AND_STEMS;

public class QuarterstaffItem implements ToolMaterial {

    public static final QuarterstaffItem INSTANCE = new QuarterstaffItem();

    @Override
    public int getDurability() {
        return 190;
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
        return Ingredient.fromTag(STRIPPED_LOGS_AND_STEMS);
    }
}

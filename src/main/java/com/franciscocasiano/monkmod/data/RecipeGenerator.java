package com.franciscocasiano.monkmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

import static com.franciscocasiano.monkmod.MonkMod.QUARTERSTAFF;
import static com.franciscocasiano.monkmod.MonkMod.THROWING_STAR;
import static com.franciscocasiano.monkmod.data.ItemTagGenerator.STRIPPED_LOGS_AND_STEMS;

public class RecipeGenerator extends FabricRecipeProvider {

    public RecipeGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(QUARTERSTAFF, 1)
                .pattern("  #")
                .pattern(" # ")
                .pattern("#  ")
                .input('#', Ingredient.fromTag(STRIPPED_LOGS_AND_STEMS))
                .criterion("has_logs", FabricRecipeProvider.conditionsFromTag(STRIPPED_LOGS_AND_STEMS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(QUARTERSTAFF)));

        ShapedRecipeJsonBuilder.create(THROWING_STAR, 8)
                .pattern(" # ")
                .pattern("# #")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT), FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(THROWING_STAR)));
    }
}

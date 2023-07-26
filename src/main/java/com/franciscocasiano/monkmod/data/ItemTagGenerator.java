package com.franciscocasiano.monkmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemTagGenerator extends FabricTagProvider<Item> {

    public ItemTagGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator, Registry.ITEM);
    }

    public static final TagKey<Item> STRIPPED_LOGS_AND_STEMS = TagKey.of(Registry.ITEM_KEY, new Identifier("monk_mod:stripped_logs_and_stems"));

    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(STRIPPED_LOGS_AND_STEMS)
                .add(Items.STRIPPED_CRIMSON_STEM)
                .add(Items.STRIPPED_WARPED_STEM)
                .add(Items.STRIPPED_ACACIA_LOG)
                .add(Items.STRIPPED_BIRCH_LOG)
                .add(Items.STRIPPED_DARK_OAK_LOG)
                .add(Items.STRIPPED_JUNGLE_LOG)
                .add(Items.STRIPPED_OAK_LOG)
                .add(Items.STRIPPED_SPRUCE_LOG)
                .add(Items.STRIPPED_MANGROVE_LOG);
    }
}

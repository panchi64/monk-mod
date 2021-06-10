package sccww.minecraft.monkmod.foundation.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import sccww.minecraft.monkmod.foundation.Registrator;

import java.util.function.Supplier;

// TODO: Add a loot table to this block in order for it to drop items when broken
public class ExampleBlock {
    public static void register() {}

    public static final RegistryObject<Block> EXAMPLE_BLOCK = register("example_block", () -> blockProperties());

    private static Block blockProperties() {
        return new Block(
                AbstractBlock.Properties
                        .of(Material.STONE)
                        .harvestLevel(2)
                        .harvestTool(ToolType.PICKAXE)
                        .sound(SoundType.STONE)
        );
    }

    /*
    ============================== HELPER METHODS ================================================
     */
//    Creates an item for the block we made with the method above
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
    RegistryObject<T> item = registerBlockOnly(name, block);
    Registrator.ITEMS.register(name, () -> new BlockItem(item.get(), blockItemProperties()));
    return item;
}

//    Creates the block itself
    private static <T extends Block> RegistryObject<T> registerBlockOnly(String name, Supplier<T> block) {
        return Registrator.BLOCKS.register(name, block);
    }

//    Helper method that defines the properties of the ITEM (not the block itself) in a more readable way
    private static Item.Properties blockItemProperties() {
        return new Item.Properties()
                .tab(ItemGroup.TAB_BUILDING_BLOCKS);
    }


}

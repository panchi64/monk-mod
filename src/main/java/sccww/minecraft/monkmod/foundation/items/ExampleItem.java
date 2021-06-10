package sccww.minecraft.monkmod.foundation.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import sccww.minecraft.monkmod.foundation.Registrator;

public class ExampleItem {
    public static void register() {}

    public static final RegistryObject<Item> EXAMPLE_ITEM = Registrator.ITEMS.register("example_item", () -> itemProperties());

//    Helper method that defines the properties of the item in a more readable way
    private static Item itemProperties() {
        return new Item(new Item.Properties()
                        .defaultDurability(200)
                        .tab(ItemGroup.TAB_MATERIALS)
        );

    }
}

package sccww.minecraft.monkmod.foundation;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import sccww.minecraft.monkmod.MonkModMain;
import sccww.minecraft.monkmod.foundation.blocks.ExampleBlock;
import sccww.minecraft.monkmod.foundation.items.ExampleItem;

public class Registrator {
//    Initialize registers for the items and blocks that will be part of the mod
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MonkModMain.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MonkModMain.MOD_ID);

//    Triggers the registration of the items and blocks to forge, without this the items and blocks will not function
    public static void register() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);

        ExampleItem.register();
        ExampleBlock.register();
    }
}

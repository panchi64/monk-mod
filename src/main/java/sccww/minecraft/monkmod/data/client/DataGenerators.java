package sccww.minecraft.monkmod.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import sccww.minecraft.monkmod.MonkModMain;

@Mod.EventBusSubscriber(modid = MonkModMain.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {
    private DataGenerators() {}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(new MonkModBlockStateProvider(generator,existingFileHelper));
        generator.addProvider(new MonkModItemModelProvider(generator, existingFileHelper));
    }
}

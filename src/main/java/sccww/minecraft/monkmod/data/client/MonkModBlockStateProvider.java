package sccww.minecraft.monkmod.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import sccww.minecraft.monkmod.MonkModMain;
import sccww.minecraft.monkmod.foundation.blocks.ExampleBlock;

public class MonkModBlockStateProvider extends net.minecraftforge.client.model.generators.BlockStateProvider {
    public MonkModBlockStateProvider(DataGenerator generator, ExistingFileHelper existingFileHelper){
        super(generator, MonkModMain.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ExampleBlock.EXAMPLE_BLOCK.get());
    }
}

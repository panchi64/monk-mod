package sccww.minecraft.monkmod.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import sccww.minecraft.monkmod.MonkModMain;

public class MonkModItemModelProvider extends net.minecraftforge.client.model.generators.ItemModelProvider {
    public MonkModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper){
        super(generator, MonkModMain.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent("example_block", modLoc("block/example_block"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated, "example_item");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}

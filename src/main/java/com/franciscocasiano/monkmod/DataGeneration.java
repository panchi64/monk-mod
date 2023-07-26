package com.franciscocasiano.monkmod;

import com.franciscocasiano.monkmod.data.ItemTagGenerator;
import com.franciscocasiano.monkmod.data.RecipeGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DataGeneration implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		fabricDataGenerator.addProvider(ItemTagGenerator::new);
		fabricDataGenerator.addProvider(RecipeGenerator::new);
	}
}

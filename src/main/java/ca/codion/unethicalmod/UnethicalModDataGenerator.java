package ca.codion.unethicalmod;

import ca.codion.unethicalmod.data.UnethicalLootTableGenerator;
import ca.codion.unethicalmod.data.UnethicalModelProvider;
import ca.codion.unethicalmod.data.UnethicalRecipeGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class UnethicalModDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(UnethicalLootTableGenerator::new);
        pack.addProvider(UnethicalRecipeGenerator::new);
        pack.addProvider(UnethicalModelProvider::new);
    }
}
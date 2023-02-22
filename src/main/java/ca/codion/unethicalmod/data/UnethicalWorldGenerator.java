package ca.codion.unethicalmod.data;

import ca.codion.unethicalmod.UnethicalMod;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class UnethicalWorldGenerator extends FabricDynamicRegistryProvider {
    public UnethicalWorldGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries, Entries entries) {
        // HERE GOES FUTURE WORLD GEN!
    }

    @Override
    public String getName() {
        return UnethicalMod.MOD_ID;
    }
}
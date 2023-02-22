package ca.codion.unethicalmod.data;

import ca.codion.unethicalmod.blocks.UnethicalModBlocks;
import ca.codion.unethicalmod.item.UnethicalModItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class UnethicalModelProvider extends FabricModelProvider {
    public UnethicalModelProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(UnethicalModBlocks.COBALT_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(UnethicalModBlocks.COBALT_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(UnethicalModBlocks.DEEPSLATE_COBALT_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(UnethicalModItem.COBALT, Models.GENERATED);
        itemModelGenerator.register(UnethicalModItem.RAW_COBALT, Models.GENERATED);
    }
}

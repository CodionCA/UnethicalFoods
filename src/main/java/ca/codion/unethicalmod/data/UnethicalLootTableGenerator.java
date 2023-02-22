package ca.codion.unethicalmod.data;

import ca.codion.unethicalmod.blocks.UnethicalModBlocks;
import ca.codion.unethicalmod.item.UnethicalModItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class UnethicalLootTableGenerator extends FabricBlockLootTableProvider {
    public UnethicalLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(UnethicalModBlocks.COBALT_BLOCK);

        addDrop(UnethicalModBlocks.COBALT_ORE, oreDrops(UnethicalModBlocks.COBALT_ORE, UnethicalModItem.RAW_COBALT));
        addDrop(UnethicalModBlocks.DEEPSLATE_COBALT_ORE, oreDrops(UnethicalModBlocks.DEEPSLATE_COBALT_ORE, UnethicalModItem.RAW_COBALT));
    }
}

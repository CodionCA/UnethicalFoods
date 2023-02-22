package ca.codion.unethicalmod.data;

import ca.codion.unethicalmod.blocks.UnethicalModBlocks;
import ca.codion.unethicalmod.item.UnethicalModItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class UnethicalRecipeGenerator extends FabricRecipeProvider {
    public UnethicalRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(UnethicalModItem.RAW_COBALT), RecipeCategory.MISC, UnethicalModItem.COBALT,
                0.7f, 200, "cobalt");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, UnethicalModItem.COBALT, RecipeCategory.DECORATIONS,
                UnethicalModBlocks.COBALT_BLOCK);

    }
}
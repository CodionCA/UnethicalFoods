package ca.codion.unethicalmod;

import ca.codion.unethicalmod.blocks.UnethicalModBlocks;
import ca.codion.unethicalmod.item.UnethicalModItem;
import ca.codion.unethicalmod.item.UnethicalItemGroup;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UnethicalMod implements ModInitializer {
	public static final String MOD_ID = "unethicalmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("unethicalmod");

	@Override
	public void onInitialize() {
		UnethicalItemGroup.registerItemGroups();
		UnethicalModItem.registerModItems();
		UnethicalModBlocks.registerModBlocks();
	}
}

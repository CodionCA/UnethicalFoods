package ca.codion.unethicalmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import ca.codion.unethicalmod.UnethicalMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class UnethicalItemGroup {
    public static ItemGroup UNETHICAL;

    public static void registerItemGroups() {
        UNETHICAL = FabricItemGroup.builder(new Identifier(UnethicalMod.MOD_ID, "unethical"))
                .displayName(Text.translatable("itemgroup.unethical"))
                .icon(() -> new ItemStack(UnethicalModItem.COOKED_TURTLE_EGG)).build();
    }
}
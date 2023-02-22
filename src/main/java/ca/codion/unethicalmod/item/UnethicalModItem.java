package ca.codion.unethicalmod.item;

import ca.codion.unethicalmod.UnethicalMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class UnethicalModItem {
        public static final Item COOKED_TURTLE_EGG = registerItem("cooked_turtle_egg",
             new Item(new FabricItemSettings()));
        public static final Item COBALT = registerItem("cobalt",
             new Item(new FabricItemSettings()));
        public static final Item RAW_COBALT = registerItem("raw_cobalt",
             new Item(new FabricItemSettings()));
        private static Item registerItem(String name, Item item ) {
            return Registry.register(Registries.ITEM, new Identifier(UnethicalMod.MOD_ID, name), item);
        }
        public static void addItemsToItemGroup () {
            addToItemGroup(ItemGroups.FOOD_AND_DRINK, COOKED_TURTLE_EGG);
            addToItemGroup(UnethicalItemGroup.UNETHICAL, COOKED_TURTLE_EGG);

            addToItemGroup(UnethicalItemGroup.UNETHICAL, COBALT);
            addToItemGroup(UnethicalItemGroup.UNETHICAL, RAW_COBALT);
        }
        private static void addToItemGroup (ItemGroup group, Item item){
            ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        }
        public static void registerModItems () {
            UnethicalMod.LOGGER.info("Registering Mod Items for " + UnethicalMod.MOD_ID);

            addItemsToItemGroup();
        }
    }

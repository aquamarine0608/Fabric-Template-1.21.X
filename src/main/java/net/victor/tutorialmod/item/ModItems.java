package net.victor.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.victor.tutorialmod.TutorialMod;

//FOR EVERY ITEM, ADD A NEW ITEM TO MOD ITEMS, ADD NEW ENTRY IN REGISTER, ADD TRANSLATION IN LANG, ADD NEW JSON WITH CONTROL DRAG

public class ModItems {

    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));
    public static final Item NEPHIS_PORTRAIT =  registerItem("nephis_portrait", new Item(new Item.Settings()));
    public static final Item AFTERNOON_SHARD = registerItem("afternoon_shard", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }


    public static void registerModItems(){
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            //ADD ENTRIES FOR EVERY NEW ITEM
            entries.add(PINK_GARNET);
            entries.add(RAW_PINK_GARNET);
            entries.add(NEPHIS_PORTRAIT);
            entries.add(AFTERNOON_SHARD);
        });
    }

    //issues with ItemGroupEvents
}

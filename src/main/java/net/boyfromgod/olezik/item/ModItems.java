package net.boyfromgod.olezik.item;

import net.boyfromgod.olezik.OlezikMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item OLEZIK_1 = registerItem("olezik_1",
            new Item(new FabricItemSettings().group(ModItemGroup.OLEZIKMOD)));
    public static final Item OLEZIK_5 = registerItem("olezik_5",
            new Item(new FabricItemSettings().group(ModItemGroup.OLEZIKMOD)));
    public static final Item OLEZIK_10 = registerItem("olezik_10",
            new Item(new FabricItemSettings().group(ModItemGroup.OLEZIKMOD)));
    public static final Item OLEZIK_50 = registerItem("olezik_50",
            new Item(new FabricItemSettings().group(ModItemGroup.OLEZIKMOD)));
    public static final Item OLEZIK_100 = registerItem("olezik_100",
            new Item(new FabricItemSettings().group(ModItemGroup.OLEZIKMOD)));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(OlezikMod.MOD_ID, name),item);
    }
    public static void registerModItems(){
        OlezikMod.LOGGER.info("Registering Items in "+OlezikMod.MOD_ID);
    }
}

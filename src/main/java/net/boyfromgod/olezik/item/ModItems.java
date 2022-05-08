package net.boyfromgod.olezik.item;

import net.boyfromgod.olezik.OlezikMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item OLEZIK_1DOLLAR = registerItem("olezik_1dollar",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item OLEZIK_5DOLLAR = registerItem("olezik_5dollar",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item OLEZIK_10DOLLAR = registerItem("olezik_10dollar",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item OLEZIK_50DOLLAR = registerItem("olezik_50dollar",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item OLEZIK_100DOLLAR = registerItem("olezik_100dollar",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(OlezikMod.MOD_ID, name),item);
    }
    public static void registerModItems(){
        OlezikMod.LOGGER.info("Registering Items in "+OlezikMod.MOD_ID);
    }
}

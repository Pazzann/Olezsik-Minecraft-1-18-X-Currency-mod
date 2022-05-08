package net.boyfromgod.olezik.item;

import net.boyfromgod.olezik.OlezikMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item OLEZIK_COIN = registerItem("olezik_coin",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(OlezikMod.MOD_ID, name),item);
    }
    public static void registerModItems(){
        OlezikMod.LOGGER.info("Registering Items in "+OlezikMod.MOD_ID);
    }
}

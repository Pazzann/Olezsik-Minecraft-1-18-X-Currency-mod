package net.boyfromgod.olezik.item;

import net.boyfromgod.olezik.OlezikMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup OLEZIKMOD = FabricItemGroupBuilder.build(new Identifier(OlezikMod.MOD_ID, "olezikmodgroup"),
            () -> new ItemStack(ModItems.OLEZIK_1));
}

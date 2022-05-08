package net.boyfromgod.olezik;

import net.boyfromgod.olezik.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OlezikMod implements ModInitializer {
	public static final String MOD_ID = "olezikmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}

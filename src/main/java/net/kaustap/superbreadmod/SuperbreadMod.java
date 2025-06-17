package net.kaustap.superbreadmod;

import net.fabricmc.api.ModInitializer;

import net.kaustap.superbreadmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SuperbreadMod implements ModInitializer {
	public static final String MOD_ID = "superbreadmod";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
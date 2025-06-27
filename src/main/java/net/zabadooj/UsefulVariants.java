package net.zabadooj;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.zabadooj.Init.ItemsInit;
import net.zabadooj.Init.ModItemTags;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UsefulVariants implements ModInitializer {
	public static final String MOD_ID = "usefulvariants";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ItemsInit.initialize();
		ModItemTags.initilise();
//		ModLootTableModifiers.modifyLootTables();

		LOGGER.info("Hello Fabric world!");
	}
}
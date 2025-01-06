package net.amteox.thebeginning;

import net.amteox.thebeginning.block.ModBlocks;
import net.amteox.thebeginning.item.ModItemGroups;
import net.amteox.thebeginning.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheBeginning implements ModInitializer {
	public static final String MOD_ID = "thebeginning";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);





	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();

	}
}
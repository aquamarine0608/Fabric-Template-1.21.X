package net.victor.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.victor.tutorialmod.block.ModBlocks;
import net.victor.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//test commit
public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}
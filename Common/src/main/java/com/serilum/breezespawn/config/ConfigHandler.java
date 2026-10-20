package com.serilum.breezespawn.config;

import com.natamus.collective.config.DuskConfig;
import com.serilum.breezespawn.util.Reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConfigHandler extends DuskConfig {
	public static HashMap<String, List<String>> configMetaData = new HashMap<String, List<String>>();

	@Entry(min = 0, max = 1.0) public static double chanceBlazeIsBreeze = 0.1;
	@Entry(registry = "dimension") public static String dimensionsToSpawnIn = "";
	@Entry(registry = "worldgen/biome") public static String biomesToSpawnIn = "";

	public static void initConfig() {
		configMetaData.put("chanceBlazeIsBreeze", Arrays.asList(
			"The chance a blaze that has spawned is a breeze entity."
		));
		configMetaData.put("dimensionsToSpawnIn", Arrays.asList(
			"Dimensions in which blazes can turn into breezes, separated by a comma. Leave empty for every dimension. For example: 'minecraft:the_nether'."
		));
		configMetaData.put("biomesToSpawnIn", Arrays.asList(
			"Biomes in which blazes can turn into breezes, separated by a comma. Biome tags work too, starting with a '#'. Leave empty for every biome. For example: 'minecraft:nether_wastes,minecraft:soul_sand_valley'."
		));

		DuskConfig.init(Reference.NAME, Reference.MOD_ID, ConfigHandler.class);
	}
}
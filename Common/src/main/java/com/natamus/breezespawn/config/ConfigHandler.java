package com.natamus.breezespawn.config;

import com.natamus.collective.config.DuskConfig;
import com.natamus.breezespawn.util.Reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConfigHandler extends DuskConfig {
	public static HashMap<String, List<String>> configMetaData = new HashMap<String, List<String>>();

	@Entry(min = 0, max = 1.0) public static double chanceBlazeIsBreeze = 0.1;

	public static void initConfig() {
		configMetaData.put("chanceBlazeIsBreeze", Arrays.asList(
			"The chance a blaze that has spawned is a breeze entity."
		));

		DuskConfig.init(Reference.NAME, Reference.MOD_ID, ConfigHandler.class);
	}
}
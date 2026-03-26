package com.natamus.breezespawn;

import com.natamus.breezespawn.config.ConfigHandler;
import com.natamus.collective.objects.SAMObject;
import net.minecraft.world.entity.EntityType;

public class ModCommon {

	public static void init() {
		ConfigHandler.initConfig();
		load();
	}

	private static void load() {
		new SAMObject(EntityType.BLAZE, EntityType.BREEZE, null, ConfigHandler.chanceBlazeIsBreeze, false, false, false);
	}
}
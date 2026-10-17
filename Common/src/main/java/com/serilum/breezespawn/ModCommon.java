package com.serilum.breezespawn;

import com.serilum.breezespawn.config.ConfigHandler;
import com.serilum.breezespawn.util.Reference;
import com.natamus.collective.globalcallbacks.ConfigCallback;
import com.natamus.collective.objects.SAMObject;
import net.minecraft.world.entity.EntityType;

public class ModCommon {
	private static SAMObject samObject;

	public static void init() {
		ConfigHandler.initConfig();
		load();
	}

	private static void load() {
		samObject = new SAMObject(EntityType.BLAZE, EntityType.BREEZE, null, ConfigHandler.chanceBlazeIsBreeze, false, false, false, false, false, Integer.MAX_VALUE);

		ConfigCallback.CONFIG_CHANGED.register((String modid) -> {
			if (!modid.equals(Reference.MOD_ID)) {
				return;
			}

			samObject.changeChance = ConfigHandler.chanceBlazeIsBreeze;
		});
	}
}
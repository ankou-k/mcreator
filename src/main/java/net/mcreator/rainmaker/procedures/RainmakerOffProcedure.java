package net.mcreator.rainmaker.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.rainmaker.RainmakerMod;

import java.util.Map;

public class RainmakerOffProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RainmakerMod.LOGGER.warn("Failed to load dependency world for procedure RainmakerOff!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		world.getWorldInfo().setRaining((false));
	}
}

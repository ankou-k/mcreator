package net.mcreator.rainmaker.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.rainmaker.RainmakerMod;

import java.util.Map;

public class RainmakerOnProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RainmakerMod.LOGGER.warn("Failed to load dependency world for procedure RainmakerOn!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		world.getWorldInfo().setRaining((true));
	}
}

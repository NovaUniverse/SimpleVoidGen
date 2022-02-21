package net.novauniverse.simplevoidgen;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

import net.novauniverse.simplevoidgen.generator.VoidGenerator;

public class SimpleVoidGen extends JavaPlugin {
	private VoidGenerator voidGenerator;
	
	@Override
	public void onEnable() {
		this.voidGenerator = new VoidGenerator();
	}
	
	@Override
	public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
		return voidGenerator;
	}
}
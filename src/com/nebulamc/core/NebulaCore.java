package com.nebulamc.core;

import java.util.HashMap;

import org.bukkit.plugin.java.JavaPlugin;

import com.nebulamc.core.flow.Flowchart;

public class NebulaCore extends JavaPlugin {
	public HashMap<String, Flowchart> Flowcharts;
	
	public NebulaCore() {
		Flowcharts = new HashMap<String, Flowchart>();
	}
}

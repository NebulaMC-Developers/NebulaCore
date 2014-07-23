package com.rivieramc.core;

import java.util.HashMap;

import org.bukkit.plugin.java.JavaPlugin;

import com.rivieramc.core.flow.Flowchart;
import com.rivieramc.core.util.LogHelper;

public class NebulaCore extends JavaPlugin {
	public HashMap<String, Flowchart> Flowcharts;
	
	public NebulaCore() {
		Flowcharts = new HashMap<String, Flowchart>();
		
		// Initialize the logger for the core plugin.
		LogHelper.init(this.getLogger());
	}
}

package com.rivieramc.core.minigame;

public interface IMinigameProvider {
	public java.util.Map<String, ? extends IMinigame> getMinigameInstances();
	public IMinigame getMinigame(String id);
	
}

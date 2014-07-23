package com.rivieramc.core.minigame;

import java.util.HashMap;

import com.rivieramc.core.util.LogHelper;

/**
 * Handles both the static registry of minigame types and the
 * runtime registry of minigame instances
 * @author joazlazer
 */
public class MinigameRegistry {
	
	/*
	 * *************************************************
	 * THE STATIC REGISTRY SECTION OF MinigameRegistry.
	 * *************************************************
	 */
	
	/**
	 * A map of the minigame type id's to their corresponding classes, to
	 * be used with instance checking or reflection.
	 */
	private static HashMap<String, Class<? extends IMinigame>> idToType;
	
	/**
	 * Registers a minigame type.
	 * @param classToRegister The class of the minigame class.
	 * @param id The unique id to register the minigame class to.
	 */
	public static void registerMinigameType(String id, Class<? extends IMinigame> classToRegister) {
		try {
			// Make sure the parameter is valid.
			if (classToRegister != null) throw new IllegalArgumentException("The class to register cannot be null!");
			if (id == null || id.trim().isEmpty() ) throw new IllegalArgumentException("The id to register cannot be null!");
			
			// Make sure the id nor and the class don't already exist.
			if (idToType.keySet().contains(id)) throw new Exception("Cannot register an existing minigame type!!!");
			if (idToType.values().contains(classToRegister)) throw new Exception("Cannot register an existing minigame type!!!");
			
			// Put the new class in the map.
			idToType.put(id, classToRegister);
		}
		catch(IllegalArgumentException ex) {
			// Log any IllegalArgumentExceptions
			LogHelper.warning("During a minigame type registry, 1 or more parameter(s) were null: ");
			LogHelper.warning(ex.getMessage());
			LogHelper.warning(ex.getStackTrace());
		}
		catch(Exception ex) {
			// Log some random exception.
			LogHelper.warning("During a minigame type registry, an exception occured: ");
			LogHelper.warning(ex.getMessage());
			LogHelper.warning(ex.getStackTrace());
		}
	}

	/**
	 * Deletes the specified class's first occurrence in the registry.
	 * @param classToRemove The class to remove.
	 */
	public static void removeMinigameType(Class<? extends IMinigame> classToRemove) {
		try {
			// Make sure the parameter is valid.
			if (classToRemove != null) throw new IllegalArgumentException("The class to remove remove be null!");
			
			// Make sure the class does already exist.
			if (!idToType.values().contains(classToRemove)) throw new Exception("Cannot remove a non-existing minigame type!!!");
			
			// Remove the class.
			idToType.remove(classToRemove);
		}
		catch(IllegalArgumentException ex) {
			// Log any IllegalArgumentExceptions
			LogHelper.warning("During a minigame type registry, 1 or more parameter(s) were null: ");
			LogHelper.warning(ex.getMessage());
			LogHelper.warning(ex.getStackTrace());
		}
		catch(Exception ex) {
			// Log some random exception.
			LogHelper.warning("During a minigame type registry, an exception occured: ");
			LogHelper.warning(ex.getMessage());
			LogHelper.warning(ex.getStackTrace());
		}
	}
	
	/**
	 * A get accessor for the map that links minigame type id's to their corresponding types.
	 * @return
	 */
	public static HashMap<String, Class<? extends IMinigame>> getIdToTypeMap() {
		return idToType;
	}
	
	/**
	 * A set accessor for the map that links minigame type id's to their corresponding types.
	 * @param newMap
	 */
	public static void setIdToTypeMap(HashMap<String, Class<? extends IMinigame>> newMap) {
		idToType = newMap;
	}
	
	/*
	 * *************************************************
	 * THE INSTANCE REGISTRY SECTION OF MinigameRegistry.
	 * *************************************************
	 */
	
	
}

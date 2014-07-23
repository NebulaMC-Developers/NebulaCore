package com.rivieramc.core.util;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogHelper {
	
	public static Logger Logger;
	
	public static void init(Logger pluginLogger) {
		Logger = pluginLogger;
	}
	
	public static void log(Level level, Object obj) {
		Logger.log(level, String.valueOf(obj));
	}
	
	public static void all(Object obj) {
		log(Level.ALL, obj);
	}
	
	public static void config(Object obj) {
		log(Level.CONFIG, obj);
	}
	
	public static void fine(Object obj) {
		log(Level.FINE, obj);
	}
	
	public static void finer(Object obj) {
		log(Level.FINER, obj);
	}
	
	public static void finest(Object obj) {
		log(Level.FINEST, obj);
	}
	
	public static void info(Object obj) {
		log(Level.INFO, obj);
	}
	
	public static void off(Object obj) {
		log(Level.OFF, obj);
	}
	
	public static void severe(Object obj) {
		log(Level.SEVERE, obj);
	}
	
	public static void warning(Object obj) {
		log(Level.WARNING, obj);
	}
}

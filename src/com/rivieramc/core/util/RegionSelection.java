package com.rivieramc.core.util;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;

public class RegionSelection {
	
	public String worldName;
	
	public RegionSelection() {
		point1 = new Point();
		point2 = new Point();
	}
	
	public RegionSelection(Point point, Point point3) {
		point1 = point;
		point2 = point3;
	}

	private Point point1;
	private Point point2;
	
	public RegionSelection setWorldName(String newWN) {
		worldName = newWN;
		return this;
	}
	
	public RegionSelection setPoint1(Point new1) {
		point1 = new1;
		return this;
	}
	
	public RegionSelection setPoint2(Point new2) {
		point2 = new2;
		return this;
	}
	
	public Point getPoint1() {
		return point1;
	}
	
	public Point getPoint2() {
		return point2;
	}
	
	public String getWorldName() {
		return worldName;
	}
	
	public World getWorld() {
		return Bukkit.getWorld(worldName);
	}
	
	public RegionSelection copy() {
		return new RegionSelection(point1.copy(), point2.copy());
	}

	public static RegionSelection fromConfig(ConfigurationSection createSection) {
		RegionSelection s = new RegionSelection();
		s.getPoint1().setX(createSection.getInt("x1", Integer.MIN_VALUE));
		s.getPoint1().setY(createSection.getInt("y1", Integer.MIN_VALUE));
		s.getPoint1().setZ(createSection.getInt("z1", Integer.MIN_VALUE));
		s.getPoint2().setX(createSection.getInt("x2", Integer.MIN_VALUE));
		s.getPoint2().setY(createSection.getInt("y2", Integer.MIN_VALUE));
		s.getPoint2().setZ(createSection.getInt("z2", Integer.MIN_VALUE));
		s.setWorldName(createSection.getString("world", ""));
		if(isMin(s.getPoint1().getX()) || isMin(s.getPoint1().getY()) || isMin(s.getPoint1().getZ()) ||
				isMin(s.getPoint1().getX()) || isMin(s.getPoint1().getY()) || isMin(s.getPoint1().getZ()) || s.getWorldName().trim().isEmpty()) return null;
		return s;
	}

	private static boolean isMin(int numb) {
		return numb == Integer.MIN_VALUE ? true : false;
	}

	public static void toConfig(FileConfiguration config, String string,
			RegionSelection bounds) {
		config.set(string + "x1", bounds.getPoint1().getX());
		config.set(string + "y1", bounds.getPoint1().getY());
		config.set(string + "z1", bounds.getPoint1().getZ());
		config.set(string + "x2", bounds.getPoint2().getX());
		config.set(string + "y2", bounds.getPoint2().getY());
		config.set(string + "z2", bounds.getPoint2().getZ());
		config.set(string + "world", bounds.getWorldName());
	}
}

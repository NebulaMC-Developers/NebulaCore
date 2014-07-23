package com.rivieramc.core.util;

import org.bukkit.Location;

/**
 * A utility class that is designed to represent a three-dimensional point.
 * @author joazlazer
 */
public class Point {
	private int x, y, z;
	
	/**
	 * Initializes a new point with the specified x, y, and z positions.
	 * @param x X Coordinate.
	 * @param y Y Coordinate.
	 * @param z X Coordinate.
	 */
	public Point(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	/**
	 * Initializes a new point with the specified x and z positions, while y to zero.
	 * @param x X Coordinate.
	 * @param z X Coordinate.
	 */
	public Point(int x, int z) {
		this.x = x;
		this.y = 0;
		this.z = z;
	}
	
	/**
	 * Initializes a new point with zero as the value for the x, y, and z coordinates.
	 */
	public Point() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	/**
	 * Initializes a new point with the x, y, and z in the Location.
	 * @param location
	 */
	public Point(Location location) {
		this.x = location.getBlockX();
		this.y = location.getBlockY();
		this.z = location.getBlockZ();
	}

	/**
	 * Returns the x coordinate of the point.
	 */
	public int getX() {
		return this.x;
	}
	
	/**
	 * Returns the y coordinate of the point.
	 */
	public int getY() {
		return this.y;
	}
	
	/**
	 * Returns the x coordinate of the point.
	 */
	public int getZ() {
		return this.z;
	}
	
	/**
	 * Sets the x coordinate and then returns itself to support chaining.
	 * @param newX The new x coordinate.
	 */
	public Point setX(int newX) {
		this.x = newX;
		return this;
	}
	
	/**
	 * Sets the y coordinate and then returns itself to support chaining.
	 * @param newY The new y coordinate.
	 */
	public Point setY(int newY) {
		this.y = newY;
		return this;
	}
	
	/**
	 * Sets the z coordinate and then returns itself to support chaining.
	 * @param newZ The new z coordinate.
	 */
	public Point setZ(int newZ) {
		this.z = newZ;
		return this;
	}
	
	/**
	 * Gets a string version of the point in a human friendly form.
	 */
	@Override
	public String toString() {
		return "(" + x + ".0, " + y + ".0, " + z + ".0)";
	}
	
	/**
	 * Gives a copy of the point.
	 * @return The new copy.
	 */
	public Point copy() {
		return new Point(x, y, z);
	}
} 

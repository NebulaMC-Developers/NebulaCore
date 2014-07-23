package com.rivieramc.core.util;

public class MathUtil {
	public static int total(Point p1, Point p2) {
		int xDim = p1.getX() - p2.getX();
		int yDim = p1.getY() - p2.getY();
		int zDim = p1.getZ() - p2.getZ();
		return (Math.abs(xDim == 0 ? 1 : xDim) * Math.abs(yDim == 0 ? 1 : yDim) * Math.abs(zDim == 0 ? 1 : zDim));
	}
}

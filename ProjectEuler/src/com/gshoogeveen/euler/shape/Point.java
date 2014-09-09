package com.gshoogeveen.euler.shape;

public class Point
{
	public static double distance(int[] p1, int[] p2, boolean square)
	{
		if (p1.length != p2.length)
			throw new RuntimeException("not the same array length");

		int[] diff = new int[p1.length];
		for (int i = 0; i < p1.length; i++)
			diff[i] = p1[i] - p2[i];

		double dist = 0.0;
		for (int a : diff)
			dist += Math.pow(a, 2);

		if (square)
			dist = Math.sqrt(dist);

		return dist;
	}

	public static double distance(int[] p1, int[] p2)
	{
		return distance(p1, p2, true);
	}

}

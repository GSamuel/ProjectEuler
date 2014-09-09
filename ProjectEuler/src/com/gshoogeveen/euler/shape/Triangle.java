package com.gshoogeveen.euler.shape;


public class Triangle
{
	int[][] points = new int[3][2];
	double[] dist = new double[3];
	public Triangle(int[][] points)
	{
		this.points = points;
		dist[0] = Point.distance(points[0], points[1], false);
		dist[1] = Point.distance(points[1], points[2], false);
		dist[2] = Point.distance(points[2], points[0], false);
	}
	
	public void show()
	{
		for(int i=0; i <3;i++)
			System.out.print("("+points[i][0]+","+points[i][1]+")");
		System.out.print(dist[0]);
		System.out.print(",");
		System.out.print(dist[1]);
		System.out.print(",");
		System.out.print(dist[2]);
		System.out.println();
	}
	
	public boolean hasRightEdge()
	{
		if(dist[0] == 0.0 || dist[1] == 0.0 || dist[2] == 0.0)
			return false;
		return (dist[0]+dist[1]==dist[2] || dist[1]+dist[2]==dist[0] || dist[2]+dist[0]==dist[1]);
	}
}

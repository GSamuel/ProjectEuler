package com.gshoogeveen.euler.solutions;

import com.gshoogeveen.euler.shape.Triangle;

public class Problem_91
{
	//SOLVED//
	public static void main(String[] args)
	{
		int size = 51;
		int count = 0;
		for(int i=0; i < size; i++)
		{
			System.out.println(i);
			for(int j=0; j < size; j++)
			{

				for(int k=0; k < size; k++)
				{
					for(int l=0; l < size; l++)
					{
						Triangle tri = new Triangle(triangle(0,0,i,j,k,l));
						if(tri.hasRightEdge())
							count++;
						
					}
				}
			}
		}
		System.out.println(count/2);
		
	}

	public static int[] point(int x, int y)
	{
		int[] p = { x, y };
		return p;
	}

	public static int[][] triangle(int p1x, int p1y, int p2x, int p2y, int p3x,
			int p3y)
	{
		int[][] triangle = { { p1x, p1y }, { p2x, p2y }, { p3x, p3y } };
		return triangle;
	}
}

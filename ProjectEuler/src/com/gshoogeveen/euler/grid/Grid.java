package com.gshoogeveen.euler.grid;

public class Grid
{
	private final int W, H;
	private final int [][] grid;
	
	public Grid(int W, int H)
	{
		this.W = W;
		this.H = H;
		grid = new int[W][H];
	}
	
	public Grid(int data[][])
	{
		this.W = data.length;
		this.H = data[0].length;
		grid = new int[W][H];
		
		for (int i = 0; i < W; i++)
			for (int j = 0; j < H; j++)
				grid[i][j] = data[i][j];
	}
	
	public int getWidth()
	{
		return W;
	}
	
	public int getHeight()
	{
		return H;
	}
	
	public int get(int x,int y)
	{
		return grid[x][y];
	}
	
	public void set(int x, int y, int value)
	{
		grid[x][y] = value;
	}
}

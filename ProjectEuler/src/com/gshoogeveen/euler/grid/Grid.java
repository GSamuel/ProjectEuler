package com.gshoogeveen.euler.grid;

public class Grid
{
	private final int M, N;
	private final int [][] grid;
	
	public Grid(int M, int N)
	{
		this.M = M;
		this.N = N;
		grid = new int[M][N];
	}
	
	public Grid(int data[][])
	{
		this.M = data.length;
		this.N = data[0].length;
		grid = new int[M][N];
		
		for (int i = 0; i < M; i++)
			for (int j = 0; j < N; j++)
				grid[i][j] = data[i][j];
	}
	
	public void clear()
	{
		clear(0);
	}
	
	public void clear(int x)
	{
		for (int i = 0; i < M; i++)
			for (int j = 0; j < N; j++)
				grid[i][j] = x;
	}
	
	public int getRows()
	{
		return M;
	}
	
	public int getColumns()
	{
		return N;
	}
	
	public int get(int x,int y)
	{
		return grid[x][y];
	}
	
	public void set(int x, int y, int value)
	{
		grid[x][y] = value;
	}
	
	public void show()
	{
		for(int i =0; i< M; i ++)
		{
			for(int j =0; j< N; j ++)
				System.out.print(grid[i][j]+",");
			System.out.println();
		}
			
	}
}

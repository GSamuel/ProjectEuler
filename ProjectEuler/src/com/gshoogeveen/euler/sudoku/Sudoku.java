package com.gshoogeveen.euler.sudoku;

import java.awt.Point;
import java.util.LinkedList;

public class Sudoku
{

	private int[][] sudoku;
	private	boolean[][][] solver;
	public static final int LENGTH = 9;

	public Sudoku(int[][] sudoku)
	{
		this.sudoku = sudoku.clone();
		solver = new boolean[LENGTH][LENGTH][LENGTH];
		init();
	}
	
	private void init()
	{
		for(int i =0; i<LENGTH; i++)
			for(int j =0; j<LENGTH; j++)
				for(int k =0; k<LENGTH; k++)
					solver[i][j][k] = true;
	}
	
	public void show()
	{
		for(int i =0; i<LENGTH; i++)
		{
			for(int j =0; j<LENGTH; j++)
				System.out.print(sudoku[i][j]);
			System.out.println();
		}
	}
	
	public void solve()
	{
		LinkedList<Point> frontier = new LinkedList<Point>();
		
		for(int i =0; i<LENGTH; i++)
			for(int j =0; j<LENGTH; j++)
				if(0< sudoku[i][j] && sudoku[i][j] <=LENGTH)
					frontier.add(new Point(i,j));
		
		for(Point p: frontier)
			System.out.print(p.x+" "+p.y+" - ");
	}
}

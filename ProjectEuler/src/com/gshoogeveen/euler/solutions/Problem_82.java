package com.gshoogeveen.euler.solutions;

import java.awt.Point;
import java.util.LinkedList;

import com.gshoogeveen.euler.grid.Grid;
import com.gshoogeveen.euler.input.ReadGrid;

public class Problem_82
{
	//SOLVED//
	public static void main(String[] args)
	{
		Grid pathCost = ReadGrid.readGridFromFile("p082_matrix.txt");
		Grid totalCost = new Grid(pathCost.getRows(), pathCost.getColumns());
		totalCost.clear(-1);

		LinkedList<Point> frontier = new LinkedList<Point>();
		for (int i = 0; i < pathCost.getRows(); i++)
		{
			totalCost.set(i, 0, pathCost.get(i, 0));
			frontier.add(new Point(i, 0));
		}
		
		
		while (!frontier.isEmpty())
		{
			Point p = frontier.removeFirst(); // X = ROW, Y = COLUMN

			// Check naar rechts
			if (p.y + 1 < pathCost.getColumns())
			{
				if (totalCost.get(p.x, p.y + 1) < 0
						|| totalCost.get(p.x, p.y) + pathCost.get(p.x, p.y + 1) < totalCost
								.get(p.x, p.y + 1))
				{
					totalCost.set(p.x, p.y + 1, totalCost.get(p.x, p.y)
							+ pathCost.get(p.x, p.y + 1));
					frontier.add(new Point(p.x, p.y + 1));
				}
			}
			// Check naar onder
			if (p.x + 1 < pathCost.getRows())
			{
				if (totalCost.get(p.x + 1, p.y) < 0
						|| totalCost.get(p.x, p.y) + pathCost.get(p.x + 1, p.y) < totalCost
								.get(p.x + 1, p.y))
				{
					totalCost.set(p.x + 1, p.y, totalCost.get(p.x, p.y)
							+ pathCost.get(p.x + 1, p.y));
					frontier.add(new Point(p.x + 1, p.y));
				}
			}
			// Check naar boven
			if (p.x - 1 >= 0)
			{
				if (totalCost.get(p.x - 1, p.y) < 0
						|| totalCost.get(p.x, p.y) + pathCost.get(p.x - 1, p.y) < totalCost
								.get(p.x - 1, p.y))
				{
					totalCost.set(p.x - 1, p.y, totalCost.get(p.x, p.y)
							+ pathCost.get(p.x - 1, p.y));
					frontier.add(new Point(p.x - 1, p.y));
				}
			}
		}
		
		int lowest = -1;
		for(int i =0; i < totalCost.getColumns() ;i++)
		{
			if(lowest < 0)
				lowest = totalCost.get(i, totalCost.getColumns()-1);
			if(totalCost.get(i, totalCost.getColumns()-1)<lowest)
				lowest = totalCost.get(i, totalCost.getColumns()-1);
		}
		
		totalCost.show();
		
		System.out.println("lowest cost to reach the right side from the left side: "+lowest);

	}
}

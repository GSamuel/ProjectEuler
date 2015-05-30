package com.gshoogeveen.euler.solutions;

import java.awt.Point;
import java.util.LinkedList;

import com.gshoogeveen.euler.grid.Grid;
import com.gshoogeveen.euler.input.ReadGrid;

public class Problem_083
{
	//SOLVED//
	public static void main(String[] args)
	{
		Grid pathCost = ReadGrid.readGridFromFile("p083_matrix.txt");
		Grid totalCost = new Grid(pathCost.getRows(), pathCost.getColumns());
		totalCost.clear(-1);

		LinkedList<Point> frontier = new LinkedList<Point>();

		totalCost.set(0, 0, pathCost.get(0, 0));
		frontier.add(new Point(0, 0));

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
			// Check naar links
			if (p.y - 1 >= 0)
			{
				if (totalCost.get(p.x, p.y - 1) < 0
						|| totalCost.get(p.x, p.y) + pathCost.get(p.x, p.y - 1) < totalCost
								.get(p.x, p.y - 1))
				{
					totalCost.set(p.x, p.y - 1, totalCost.get(p.x, p.y)
							+ pathCost.get(p.x, p.y - 1));
					frontier.add(new Point(p.x, p.y - 1));
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

		int lowest = totalCost.get(totalCost.getRows()-1, totalCost.getColumns()-1);

		totalCost.show();

		System.out
				.println("lowest cost to get to the down right: "
						+ lowest);

	}
}

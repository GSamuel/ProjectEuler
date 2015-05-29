package com.gshoogeveen.euler.input;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadPoint
{
	public static ArrayList<int[]> readPoints(String file)
	{
		ArrayList<int[]> points = new ArrayList<int[]>();

		Scanner input = null;

		try
		{
			input = new Scanner(new File(file));
			while (input.hasNextLine())
			{
				String[] tuple = input.nextLine().split(",");
				int[] intTuple = {Integer.parseInt(tuple[0]),Integer.parseInt(tuple[1])};
				points.add(intTuple);
			}
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} finally
		{
			input.close();
		}

		return points;
	}
}

package com.gshoogeveen.euler.input;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadSudoku
{

	public static int[][] readSudokuFromFile(String file)
	{
		int[][] matrix = new int[9][9];
		char[][] line = new char[9][9];
		Scanner input = null;

		try
		{
			input = new Scanner(new File(file));
			input.nextLine();
			for (int i = 0; i < 9; i++)
				line[i] = input.nextLine().toCharArray();

		} catch (FileNotFoundException e)
		{
			System.out.println("file not found");
			return null;
		} finally
		{
			input.close();
		}

		if (line != null)
		{
			for (int i = 0; i < line.length; i++)
			{
				for (int j = 0; j < line[i].length; j++)
				{
					matrix[i][j] = Integer.parseInt("" + line[i][j]);
				}
			}
		}

		return matrix;

	}
}

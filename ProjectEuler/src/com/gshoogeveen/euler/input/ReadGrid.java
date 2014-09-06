package com.gshoogeveen.euler.input;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

import com.gshoogeveen.euler.grid.Grid;

public class ReadGrid
{
	public static Grid readGridFromFile(String file)
	{		
		LineNumberReader lnr = null;
		int lineCount;
		
		try
		{

			lnr = new LineNumberReader(new FileReader(
					new File(file)));
			lnr.skip(Long.MAX_VALUE);
			lineCount = lnr.getLineNumber();
		} catch (IOException e)
		{
			System.out.println("file not found");
			return null;
		} finally
		{
			try
			{
				lnr.close();
			} catch (IOException e)
			{
				return null;
			}
		}

		int[][] data =  new int[lineCount][];
		
		Scanner input = null;
		try
		{
			input = new Scanner(new File(file));
			for (int i = 0; i < lineCount; i++)
			{
				String[] line = input.nextLine().split(",");
				data[i] = new int[line.length];
				for(int j = 0; j < line.length; j++)
					data[i][j] = Integer.parseInt(line[j]);
			}
			
		} catch (FileNotFoundException e)
		{
			System.out.println("file not found");
			return null;
		} finally
		{
			input.close();
		}

		return new Grid(data);
	}
}

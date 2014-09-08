package com.gshoogeveen.euler.input;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadList
{
	public static int[] readListFromFile(String file)
	{
		int[] list = null;
		String[] line;
		Scanner input = null;
		
		try
		{
			input = new Scanner(new File(file));
			line = input.nextLine().split(",");
			
		} catch (FileNotFoundException e)
		{
			System.out.println("file not found");
			return null;
		} finally
		{
			input.close();
		}
		if(line != null)
		{
			list = new int[line.length];
			for(int i =0; i < line.length; i++)
				list[i] = Integer.parseInt(line[i]);
		}
		
		return list;
		
	}
}

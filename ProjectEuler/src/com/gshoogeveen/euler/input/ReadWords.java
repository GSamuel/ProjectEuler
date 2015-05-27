package com.gshoogeveen.euler.input;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadWords
{
	public static String[] readWords(String file)
	{
		String[] line = new String[0];
		Scanner input = null;
		try
		{
			input = new Scanner(new File(file));
			line = input.nextLine().replaceAll("\"", "").split(",");
			
			
		} catch (FileNotFoundException e)
		{
		} finally
		{
			input.close();
		}
		
		return line;
	}
}

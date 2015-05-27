package com.gshoogeveen.euler.solutions;

import com.gshoogeveen.euler.input.ReadWords;

public class Problem_42
{
	private static String letters= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static void main(String[] args)
	{
		String[] words = ReadWords.readWords("p042_words.txt");
		
		int count = 0;
		for(String word: words)
			if(triangleWord(word))
				count++;
		
		System.out.println("answer:"+count);
			
	}
	
	public static int function(int n)
	{
		return (int) (0.5*n*(n+1));
	}
	
	public static boolean triangleWord(String word)
	{
		int wordValue = wordValue(word);
		
		for(int i =1 ; ;i++)
		{
			int value = function(i);
			if(value == wordValue)
				return true;
			else if(value > wordValue)
				return false;
		}
	}
	
	public static int wordValue(String word)
	{
		int value = 0;
		for(char c: word.toCharArray())
			value += letters.indexOf(c)+1;
		return value;
	}

}

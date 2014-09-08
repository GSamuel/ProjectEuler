package com.gshoogeveen.euler.solutions;

import com.gshoogeveen.euler.input.ReadList;

public class Problem_59
{
	public static void main(String[] args)
	{
		int[] list = ReadList.readListFromFile("p059_cipher.txt");
		for(int i =0; i<list.length;i++)
			System.out.print((char)(list[i]^'h'));
	}
}

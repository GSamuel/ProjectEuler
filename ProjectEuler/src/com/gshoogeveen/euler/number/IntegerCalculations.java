package com.gshoogeveen.euler.number;

import java.util.ArrayList;

public class IntegerCalculations
{
	public static int[] getProperDivisors(int num)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 1; i < num; i++)
			if(num % i == 0)
				list.add(i);
		

		int[] array = new int[list.size()];
		for(int i = 0; i < list.size(); i++)
			array[i] = list.get(i);
		
		return array;
	}
	
	public static int sum(int[] list)
	{
		int total = 0;
		for(int num:list)
			total += num;
		return total;
	}
}

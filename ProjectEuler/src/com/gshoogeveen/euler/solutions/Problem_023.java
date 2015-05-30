package com.gshoogeveen.euler.solutions;

import java.util.ArrayList;

import com.gshoogeveen.euler.number.IntegerCalculations;

public class Problem_023
{
	//SOLVED//
	public static void main(String[] args)
	{
		final int max = 28124;
		
		ArrayList<Integer> abundants = new ArrayList<Integer>();
		boolean results[] = new boolean [max];

		for (int i = 0; i < max; i++)
		{
			int[] list = IntegerCalculations.getProperDivisors(i);
			int sum = IntegerCalculations.sum(list);
			if (sum > i)
				abundants.add(i);

			results[i] = true; // initialize results, by putting in all numbers
							// from 0 to 28124
		}
		

		for (int i = 0; i < abundants.size(); i++)
		{
			for (int j = i; j < abundants.size(); j++)
			{
				if(abundants.get(i)+abundants.get(j) < max)
				results[abundants.get(i)+abundants.get(j)] = false;
			}
		}
		
		int total = 0;
		for(int i = 0; i < results.length; i ++)
		{
			if(results[i])
				total += i;
		}
		System.out.println("The final answer is:"+total);

	}
}

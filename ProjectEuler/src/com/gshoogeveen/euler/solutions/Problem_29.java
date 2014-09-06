package com.gshoogeveen.euler.solutions;

import java.util.HashMap;

public class Problem_29
{

	public static void main(String[] args)
	{
		int range = 100;
		int min = 2;

		HashMap<Double,Double> map = new HashMap<Double,Double>();
		for (int i = min; i <= range; i++)
			for (int j = min; j <= range; j++)
			{
				Double d = Math.pow(i, j);
				map.put(d,d);
			}
		/*
		for(Double d: map.values())
			System.out.println(d);
		*/
		
		System.out.println("The answer is:"+ map.size());
	

	}
}

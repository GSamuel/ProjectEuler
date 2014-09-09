package com.gshoogeveen.euler.solutions;

import java.util.HashMap;

import com.gshoogeveen.euler.number.IntegerCalculations;

public class Problem_92
{
	public static void main(String[] args)
	{
		int max = 10000000;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		int count = 0;
		for (int i = 1; i < max; i++)
		{
			System.out.println(i);
			int num = i;
			while (num != 1 && num != 89)
			{
				//System.out.println("key:" + num + " value:" + map.get(num));
				if (map.containsKey(num))
					num = map.get(num);
				else
				{
					int newNum = squareAllDigits(num);
					//map.put(num, newNum);
					num = newNum;
				}
				
				if(num == 89)
					count++;
			}
		}
		System.out.println(count);
	}

	public static int squareAllDigits(int num)
	{
		int answer = 0;
		int[] array = IntegerCalculations.getDigits(num);
		for (int i : array)
			answer += Math.pow(i, 2);

		return answer;
	}
}

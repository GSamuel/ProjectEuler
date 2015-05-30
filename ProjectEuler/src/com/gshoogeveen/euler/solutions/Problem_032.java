package com.gshoogeveen.euler.solutions;

import java.util.HashMap;
import java.util.LinkedList;

import com.gshoogeveen.euler.number.IntegerCalculations;

public class Problem_032
{
	//SOLVED//
	private static LinkedList<Integer[]> finalList = new LinkedList<Integer[]>();
	private static final int[] numbers = IntegerCalculations
			.getDigits(123456789);

	public static void main(String[] args)
	{
		Integer[] list = new Integer[9];
		function(list, 0);
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

		for (Integer[] nums : finalList)
		{
			for (int i = 1; i <= 7; i++)
				for (int j = 1; j + i <= 8; j++)
				{
					int[] a = new int[i];
					int[] b = new int[j];
					int[] c = new int[nums.length - i - j];
					for (int k = 0; k < i; k++)
						a[k] = nums[k];
					for (int k = 0; k < j; k++)
						b[k] = nums[k + i];
					for (int k = 0; k < nums.length - i - j; k++)
						c[k] = nums[k + i + j];

					int numA = IntegerCalculations.digitsToInteger(a);
					int numB = IntegerCalculations.digitsToInteger(b);
					int numC = IntegerCalculations.digitsToInteger(c);

					if (numA * numB == numC)
					{
						System.out.println(numA + " x " + numB + " = " + numC);
						map.put(numC, numC);
					}

				}

		}
		int total = 0;
		for(Integer num: map.values())
			total += num;
		
		System.out.println("The final answer to the problem is: "+total);
			
	}

	private static boolean function(Integer[] list, int point)
	{
		if (point == list.length)
		{
			finalList.add(list);
			return true;
		}
		for (int num = 0; num < numbers.length; num++)
		{
			if (!contains(list, numbers[num]))
			{
				Integer[] copy = copy(list);
				copy[point] = numbers[num];
				function(copy, point + 1);
			}
		}
		return false;
	}

	private static Integer[] copy(Integer[] list)
	{
		Integer[] list2 = new Integer[list.length];
		for (int i = 0; i < list2.length; i++)
			list2[i] = list[i];

		return list2;
	}

	private static boolean contains(Integer[] list, int check)
	{
		for (int i = 0; i < list.length; i++)
			if (list[i] != null)
				if (list[i] == check)
					return true;
		return false;
	}
}

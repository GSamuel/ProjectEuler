package com.gshoogeveen.euler.solutions;

import com.gshoogeveen.euler.number.IntegerCalculations;

public class Problem_092
{
	// SOLVED//
	private static int[] squares = { 0, 1, 4, 9, 16, 25, 36, 49, 64, 81 };

	public static void main(String[] args)
	{
		int max = 10000000;

		System.out.println("Takes 10-20 seconds to calculate");

		int count = 0;
		for (int i = 1; i < max; i++)
		{
			if (lastChain(i) == 89)
				count++;
		}
		System.out.println("The answer to the problem is: " + count);
	}

	public static int lastChain(int num)
	{
		if (num == 89 || num == 1)
			return num;
		return lastChain(squareAllDigits(num));
	}

	public static int squareAllDigits(int num)
	{
		int answer = 0;
		int[] array = IntegerCalculations.getDigits(num);
		for (int i : array)
			answer += squares[i];

		return answer;
	}
}

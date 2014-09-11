package com.gshoogeveen.euler.solutions;

public class Problem_31
{
	//SOLVED//
	private static int[] diffCoins = { 1, 2, 5, 10, 20, 50, 100, 200 };
	private static int max = 200;

	public static void main(String[] args)
	{
		System.out.println(calculate(0, 0));
	}

	public static int calculate(int sum, int coinID)
	{
		if (sum == max)
		{
			return 1;
		} else if (sum > max || coinID >= diffCoins.length)
			return 0;
		else
		{
			return (calculate(sum + diffCoins[coinID], coinID) + calculate(sum, coinID+1));
			
		}
	}
}

package com.gshoogeveen.euler.number;

import java.math.BigInteger;
import java.util.ArrayList;

public class IntegerCalculations
{
	public static int[] getDigits(int num)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();

		while (num > 0)
		{
			list.add(0, num % 10); // place low order digit in array
			num = num / 10; // remove low order digit from temp;
		}

		return arrayListToArray(list);

	}
	
	public static int[] getDigits(long num)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();

		while (num > 0)
		{
			list.add(0, (int)(num % 10)); // place low order digit in array
			num = num / 10; // remove low order digit from temp;
		}

		return arrayListToArray(list);
	}

	public static int digitsToInteger(int[] list)
	{
		int num = 0;
		for (int n : list)
		{
			num *= 10;
			num += n;
		}

		return num;
	}

	private static int[] arrayListToArray(ArrayList<Integer> list)
	{
		int[] array = new int[list.size()];
		for (int i = 0; i < list.size(); i++)
			array[i] = list.get(i);

		return array;
	}

	public static int[] getProperDivisors(int num)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < num; i++)
			if (num % i == 0)
				list.add(i);

		return arrayListToArray(list);
	}

	public static int sum(int[] list)
	{
		int total = 0;
		for (int num : list)
			total += num;
		return total;
	}

	public static int[] getAllRotations(int num)
	{
		int length = (int) (Math.log10(num) + 1);
		int results[] = new int[length];
		results[0] = num;

		for (int i = 1; i < length; i++)
		{
			int rest = num % 10;
			num /= 10;
			num += rest * Math.pow(10, length - 1);
			results[i] = num;
		}

		return results;
	}
	
	public static int[] countDigits(int num)
	{
		int[] digits = new int[10];
		int[] dig = IntegerCalculations.getDigits(num);
		for(int d: dig)
			digits[d]++;
		return digits;
	}
	
	public static boolean isSameList(int[] a, int[] b)
	{
		if(a.length != b.length)
			return false;
		
		for(int i = 0; i < a.length; i++)
			if(a[i] != b[i])
				return false;
		return true;
	}
	
	public static BigInteger faculty(BigInteger num)
	{
		if(num.compareTo(BigInteger.ONE) == 0 || num.compareTo(BigInteger.ZERO) == 0)
			return BigInteger.ONE;
		else
			return num.multiply(faculty(num.subtract(BigInteger.ONE)));
	}
	
	
	
	public static BigInteger power(int a, int b)
	{
		BigInteger base = new BigInteger(""+a);
		BigInteger value = BigInteger.ONE;
		while(b-->0)
			value = value.multiply(base);
				
		return value;
	}
	
	public static long faculty(long num)
	{
		if(num == 1 || num == 0)
			return 1;
		else
			return num * faculty(num-1);
	}
}

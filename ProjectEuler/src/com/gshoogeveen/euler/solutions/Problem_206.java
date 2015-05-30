package com.gshoogeveen.euler.solutions;

import java.math.BigInteger;

import com.gshoogeveen.euler.number.BigIntSqRoot;
import com.gshoogeveen.euler.number.IntegerCalculations;

public class Problem_206
{
	private static final int[] check =
	{ 1, -1, 2, -1, 3, -1, 4, -1, 5, -1, 6, -1, 7, -1, 8, -1, 9, -1, 0 };

	public static void main(String[] args)
	{
		BigInteger max = new BigInteger("1929394959697989990");
		BigInteger min = new BigInteger("1020304050607080900");

		long minBase = BigIntSqRoot.bigIntSqRootFloor(min).longValue();
		long maxBase = BigIntSqRoot.bigIntSqRootCeil(max).longValue();
		System.out.println("min:"+minBase);
		System.out.println("max:"+maxBase);

		for (long i = minBase; i < maxBase; i++)
		{
			long x = i * i;
			if (solutionCheck(x))
				System.out.println("answer:" + i);
			if(i%1000000 == 0)
				System.out.println(i);
		}

	}

	public static boolean solutionCheck(long x)
	{
		int[] num = IntegerCalculations.getDigits(x);
		for (int i = 0; i < check.length; i++)
		{
			if (check[i] != -1)
				if (check[i] != num[i])
					return false;
		}
		return true;

	}

}

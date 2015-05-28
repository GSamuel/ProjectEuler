package com.gshoogeveen.euler.solutions;

import java.math.BigInteger;

import com.gshoogeveen.euler.number.IntegerCalculations;

public class Problem_85 {

	/**
	 * @param args
	 */
	private static final int twoMil = 2000000;
	
	public static void main(String[] args) {
		
		long minDiff = twoMil; //Area that is closest 2mil 
		for(int sumSides = 2; sumSides<1000; sumSides++)
			for(int i = 1; i < sumSides; i++)
			{
				int j = sumSides - i;
				int area = countRectangle(i,j);
				int diff = Math.abs(area - twoMil);
				if ( diff < minDiff)
				{
					minDiff = diff;
					System.out.println(i+","+j+" area:"+area);
				}
			}

		System.out.println(countRectangle(1, 3));
	}
	
	public static int countRectangle(int w, int h)
	{
		return addOneToN(w)*h;
	}
	
	public static int countLine(int a)
	{
		if(a == 1)
			return 1;
		else
			return 1+2*countLine(a-1);
	}
	
	public static int addOneToN(int n)
	{
		if(n == 1 || n == 0)
			return 1;
		else
			return n+ addOneToN(n-1);
	}

}


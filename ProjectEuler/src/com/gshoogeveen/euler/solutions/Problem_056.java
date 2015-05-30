package com.gshoogeveen.euler.solutions;

import com.gshoogeveen.euler.number.IntegerCalculations;

public class Problem_056 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int maxSum = 0;
		
		for(int a =1; a <100; a++)
			for(int b = 1; b<100; b++)
			{
				int value = sum(IntegerCalculations.power(a,b).toString().toCharArray());
				if(value>maxSum)
					maxSum = value;
			}
		System.out.println("answer:"+maxSum);
	}
	
	public static int sum(char[] chars)
	{
		int value = 0;
		
		for(char c: chars)
			value+= ((int) c)-48;
				
		return value;
	}

}

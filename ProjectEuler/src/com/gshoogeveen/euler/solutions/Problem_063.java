package com.gshoogeveen.euler.solutions;

import com.gshoogeveen.euler.number.IntegerCalculations;

public class Problem_063 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int count = 0;
		
		for(int a =1; a <100; a++)
			for(int b = 1; b<100; b++)
			{
				int length = IntegerCalculations.power(a,b).toString().length();
				if(b == length)
					count++;
			}
		System.out.println("answer:"+count);

	}

}

package com.gshoogeveen.euler.solutions;

import java.math.BigInteger;

import com.gshoogeveen.euler.number.IntegerCalculations;

public class Problem_53 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		BigInteger limit = new BigInteger("1000000");
		
		int count = 0 ;
		
		for(int n = 1; n<=100; n++)
			for(int r = 1; r <=n; r++)
				if (function(n,r).compareTo(limit) == 1)
					count ++;
		
		System.out.println("answer:"+count);
					
	}
	
	public static BigInteger function(int a, int b)
	{
		if(a<0 || b < 0 || b > a)
			throw new IllegalArgumentException("Parameters are lower then 0 or second parameter is bigger then the first");
			
		BigInteger n = new BigInteger(""+a);
		BigInteger r = new BigInteger(""+b);
		
		BigInteger nfac = IntegerCalculations.faculty(n);
		BigInteger rfac = IntegerCalculations.faculty(r);
		BigInteger subfac = IntegerCalculations.faculty(n.subtract(r));
		
		return nfac.divide(rfac.multiply(subfac));
	}

}

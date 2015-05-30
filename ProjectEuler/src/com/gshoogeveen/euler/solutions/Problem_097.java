package com.gshoogeveen.euler.solutions;

import java.math.BigInteger;


public class Problem_097
{

	public static void main(String[] args)
	{
		BigInteger bigNum = new BigInteger("28433").shiftLeft(7830457);
		bigNum = bigNum.add(BigInteger.ONE);
		
		System.out.println("answer:" + bigNum.remainder(new BigInteger("10000000000")));
	}

}

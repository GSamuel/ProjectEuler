package com.gshoogeveen.euler.solutions;

import com.gshoogeveen.euler.primes.PrimeBuilder;

public class MainOnzin
{

	public static void main(String[] args)
	{
		PrimeBuilder primes = PrimeBuilder.getInstance();
		System.out.println(primes.getPrime(1000000));
	}

}

package com.gshoogeveen.euler.solutions;

import java.util.ArrayList;

import com.gshoogeveen.euler.number.IntegerCalculations;
import com.gshoogeveen.euler.primes.PrimeBuilder;

public class Problem_35
{
	//SOLVED// answer: 55         (takes around 6 min before the code is finished running)
	public static void main(String[] args)
	{
		PrimeBuilder primes = PrimeBuilder.getInstance();
		
		ArrayList<Integer> primeList = primes.getPrimesBelow(1000000);
		
		
		int totalRotationPrimes = 0;
		int[] rotations;
		for(int prime: primeList)
		{
			boolean rotPrime = true;
			rotations = IntegerCalculations.getAllRotations(prime);
			for(int rot: rotations)
				if(!primes.isPrime(rot))
					rotPrime = false;
			if(rotPrime)
				totalRotationPrimes++;
		}
		
		System.out.println("The total amount of rotation primes is:"+totalRotationPrimes);
		
	}
}

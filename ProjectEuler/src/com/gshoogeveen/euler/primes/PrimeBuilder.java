package com.gshoogeveen.euler.primes;

import java.util.ArrayList;

public class PrimeBuilder
{
	private ArrayList<Integer> primes = new ArrayList<Integer>();
	private static volatile PrimeBuilder builder;

	private PrimeBuilder()
	{
	}

	public static PrimeBuilder getInstance()
	{
		if (builder != null)
			return builder;
		synchronized (PrimeBuilder.class)
		{
			if (builder == null)
				builder = new PrimeBuilder();
		}
		return builder;
	}

	public void calculateAmount(int until)
	{

	}

	public int calculateNextPrime()
	{
		if (primes.size() == 0)
		{
			primes.add(2);
			return 2;
		} else
		{
			int count = highestPrime();
			boolean isPrime;
			do
			{
				isPrime = true;
				count++;
				for (int prime : primes)
				{
					if (prime * prime > count)
						break;
					if (count % prime == 0)
					{
						isPrime = false;
						break;
					}
				}
			} while (!isPrime);
			primes.add(count);
			return count;

		}
	}

	public void calculateAllBelow(int newMax)
	{
		if (primes.size() == 0 && newMax > 2)
			primes.add(2);

		for (int i = highestPrime() + 1; i < newMax; i++)
		{
			boolean isPrime = true;
			for (int prime : primes)
			{
				if (prime * prime > i)
					break;
				if (i % prime == 0)
				{
					isPrime = false;
					break;
				}
			}

			if (isPrime)
				primes.add(i);

		}
	}

	public int getPrime(int num)
	{
		while(primes.size() < num)
			calculateNextPrime();
		return primes.get(num - 1);
	}

	public boolean isPrime(int num)
	{
		calculateAllBelow(num + 1);
		return primes.contains(num);
	}

	public void show()
	{
		for (int prime : primes)
			System.out.println(prime);
	}

	public int highestPrime()
	{
		return primes.get(primes.size() - 1);
	}

	public int amountPrimes()
	{
		return primes.size();
	}

	public ArrayList<Integer> getPrimesBelow(int range)
	{
		calculateAllBelow(range);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int num : primes)
			if (num < range)
				list.add(num);
		return list;
	}
}

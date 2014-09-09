package com.gshoogeveen.euler.number;

public class Fraction implements Comparable<Fraction>
{
	private int num, det;

	public Fraction(int numerator, int determinator)
	{
		this.num = numerator;
		this.det = determinator;
	}

	public int getNumerator()
	{
		return num;
	}

	public void setNumerator(int num)
	{
		this.num = num;
	}

	public int getDeterminator()
	{
		return det;
	}

	public void setDeterminator(int det)
	{
		this.det = det;
	}

	public double value()
	{
		return 1.0 * num / det;
	}
	
	public void reduce()
	{
		int[] numList = IntegerCalculations.getProperDivisors(num);
		int[] detList = IntegerCalculations.getProperDivisors(det);
		int biggest = 1;
		for(int n:numList)
			for(int d: detList)
				if(d==n && d>biggest)
					biggest = d;
		
		num /= biggest;
		det /= biggest;
	}

	@Override
	public int compareTo(Fraction frac)
	{
		if (value() == frac.value())
			return 0;
		if (value() > frac.value())
			return 1;
		return -1;
	}

	public double difference(Fraction frac, boolean unsigned)
	{
		double num = difference(frac);
		if (unsigned && num < 0)
			num *= -1;
		return num;
	}

	public double difference(Fraction frac)
	{
		return value() - frac.value();
	}

	public void show()
	{
		System.out.println(num + "/" + det + " : " + value());
	}
}

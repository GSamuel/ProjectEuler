package com.gshoogeveen.euler.solutions;

import com.gshoogeveen.euler.number.Fraction;

public class Problem_071
{
	//SOLVED//
	public static void main(String[] args)
	{
		int max = 1000000;

		Fraction goal = new Fraction(3, 7);
		Fraction closest = new Fraction(1, 1);

		Fraction test = new Fraction(1, 1);

		while (test.getNumerator() <= max && test.getDeterminator() <= max)
		{
			if (goal.difference(closest, true) > goal.difference(test, true)
					&& goal.difference(test) != 0)
			{
				closest.setNumerator(test.getNumerator());
				closest.setDeterminator(test.getDeterminator());
			}
			
			if (goal.difference(test) > 0)
				test.setNumerator(test.getNumerator() + 1);
			else
				test.setDeterminator(test.getDeterminator() + 1);

		}
		closest.show();
	}
}

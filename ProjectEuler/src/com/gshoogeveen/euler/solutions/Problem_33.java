package com.gshoogeveen.euler.solutions;

import java.util.ArrayList;

import com.gshoogeveen.euler.number.Fraction;

public class Problem_33
{

	public static void main(String[] args)
	{
		//SOLVED// answer is 100
		ArrayList<Fraction> fractions = new ArrayList<Fraction>();
		
		for(int i=10; i < 100; i++)
			for(int j=i+1; j< 100; j++)
			{
				Fraction frac = new Fraction(i,j);
				int newNum = frac.getNumerator()/10;
				int oldNum = frac.getNumerator()%10;
				int newDet = frac.getDeterminator()%10;
				int oldDet =frac.getDeterminator()/10;
				if(frac.compareTo(new Fraction(newNum, newDet))==0 && oldNum== oldDet)
					fractions.add(frac);
			}
		
		Fraction bigFrac = new Fraction(1,1);
		for(Fraction frac: fractions)
		{
			bigFrac.setNumerator(bigFrac.getNumerator()*frac.getNumerator());
			bigFrac.setDeterminator(bigFrac.getDeterminator()*frac.getDeterminator());
		}
		
		System.out.println(bigFrac.getNumerator()+" / "+bigFrac.getDeterminator());
		bigFrac.reduce();
		System.out.println(bigFrac.getNumerator()+" / "+bigFrac.getDeterminator());
		

	}

}

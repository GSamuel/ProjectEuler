package com.gshoogeveen.euler.solutions;

import com.gshoogeveen.euler.number.IntegerCalculations;

public class Problem_52
{

	public static void main(String[] args)
	{
		for (int i = 1;; i++)
		{

			int[] dig1 = IntegerCalculations.countDigits(i);
			int[] dig2 = IntegerCalculations.countDigits(i*2);
			int[] dig3 = IntegerCalculations.countDigits(i*3);
			int[] dig4 = IntegerCalculations.countDigits(i*4);
			int[] dig5 = IntegerCalculations.countDigits(i*5);
			int[] dig6 = IntegerCalculations.countDigits(i*6);
			if(IntegerCalculations.isSameList(dig1, dig2))
				if(IntegerCalculations.isSameList(dig2, dig3))
					if(IntegerCalculations.isSameList(dig3, dig4))
						if(IntegerCalculations.isSameList(dig4, dig5))
							if(IntegerCalculations.isSameList(dig5, dig6))
							{
								System.out.println("solution:"+i);
								return;
							}
		}
	}

}

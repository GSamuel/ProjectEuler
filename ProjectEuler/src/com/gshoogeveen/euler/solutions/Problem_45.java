package com.gshoogeveen.euler.solutions;

public class Problem_45
{

	public static void main(String[] args)
	{
		int answerAmount = 3;
		int penN = 1, triN = 1, hexN = 1;
		long penVal = pentagonalFunction(penN);
		long triVal = triangleFunction(triN);
		long hexVal = hexagonalFunction(hexN);
		int lastIndexTimer=0;

		for (int i = 0; i < answerAmount; i++)
		{
			do
			{
				if (penVal < triVal && penVal < hexVal)
				{
					penN++;
					penVal = pentagonalFunction(penN);
				} else if (triVal < hexVal)
				{
					triN++;
					triVal = triangleFunction(triN);
				} else
				{
					hexN++;
					hexVal = hexagonalFunction(hexN);
				}

			} while (!(penVal == triVal && penVal == hexVal));

			System.out.println("Tri:" + triN + " Pen:" + penN + " Hex" + hexN
					+ " Value:" + penVal);
		}
	}

	public static long pentagonalFunction(long n)
	{
		return (long) (n * (3 * n - 1) * 0.5);
	}

	public static long triangleFunction(long n)
	{
		return (long) (n * (n + 1) * 0.5);
	}

	public static long hexagonalFunction(long n)
	{
		return (long) (n * (2 * n - 1));
	}

}

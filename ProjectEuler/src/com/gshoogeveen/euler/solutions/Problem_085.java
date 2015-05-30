package com.gshoogeveen.euler.solutions;


public class Problem_085 {

	/**
	 * @param args
	 */
	private static final int twoMil = 2000000;
	
	public static void main(String[] args) {
		
		long minDiff = twoMil; //Area that is closest 2mil 
		long bestArea = 0;
		for(int sumSides = 2; sumSides<200; sumSides++)
			for(int i = 1; i < sumSides; i++)
			{
				int j = sumSides - i;
				int area = countRectangle(i,j);
				int diff = Math.abs(area - twoMil);
				if ( diff < minDiff)
				{
					minDiff = diff;
					bestArea = i*j;
					System.out.println(i+","+j+" area:"+area);
				}
			}
		
		System.out.println("answer:"+bestArea);
	}
	
	public static int countRectangle(int w, int h)
	{
		int value = 0;
		for(int i =1; i <= w; i++)
			for(int j = 1; j <= h; j++)
				value += i*j;
		return value;
	}
	
	public static int countLine(int a)
	{
		if(a == 1)
			return 1;
		else
			return 1+2*countLine(a-1);
	}
	
	public static int addOneToN(int n)
	{
		if(n == 1 || n == 0)
			return 1;
		else
			return n+ addOneToN(n-1);
	}

}


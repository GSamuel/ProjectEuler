package com.gshoogeveen.euler.solutions;

import java.util.HashMap;

import com.gshoogeveen.euler.shape.TriangleSides;

public class Problem_039
{
	public static void main(String args[])
	{
		TriangleSides tri = new TriangleSides();
		HashMap<Double, Integer> map = new HashMap<Double, Integer>();
		
		TriangleSides bestTri = null;
		int highest = 0;
		
		for(int p = 1; p<1000; p++)
		{
			for(int i = 1; i < 1000; i++)
				for (int j =i; j < 1000; j++)
				{
					tri.setValue(i, j);
					if (i+j+tri.getC() == p)
					{
						System.out.println(tri);
						Integer count = map.get(tri.length());
						
						if(count == null)
							count = 1;
						else
							count++;
						
						map.put(tri.length(), count);

						if(count >= highest)
						{
							highest = count;
							bestTri = tri.clone();
						}
						System.out.println(count);
					}						
				}
		}
		
		System.out.println(bestTri);
		System.out.println(map.get(bestTri.length()));
		System.out.println(map.get(120.0));
	}
}

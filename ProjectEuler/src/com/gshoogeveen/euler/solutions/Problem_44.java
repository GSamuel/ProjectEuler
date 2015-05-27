package com.gshoogeveen.euler.solutions;

import java.util.HashMap;

public class Problem_44
{
	private static HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	private static int highest = 0;
	private static int index = 0;
	
	public static void main(String[] args)
	{
		for(int sum = 2; true; sum++)
			for(int k = 1; k < sum; k++)
			{
				int j = sum -k;
				int pj = pentagonalFunction(j);
				int pk = pentagonalFunction(k);
				if(isPentagonal(pj+pk) && isPentagonal(Math.abs(pj-pk)))
				{
					System.out.println(pk+"-"+pj+" D:"+Math.abs(pj-pk));
					return;
				}
				
			}
	}
	
	public static int pentagonalFunction(int n)
	{
		return (int) (n*(3*n-1)*0.5);
	}
	
	public static boolean isPentagonal(int n)
	{
		while(n>highest)
		{
			index++;
			highest = pentagonalFunction(index);
			map.put(highest, index);
		}
		
		return map.get(n)!=null;
	}

}

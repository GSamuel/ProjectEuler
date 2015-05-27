package com.gshoogeveen.euler.solutions;

import java.util.ArrayList;

public class Problem_40
{
	public static void main(String args[])
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int count = 0;
		while(list.size()<=1000000)
		{
			ArrayList<Integer> split = split(count);
			for(int x: split)
				list.add(x);
			count++;
		}
		
		System.out.println(list.get(1) * list.get(10)* list.get(100)* list.get(1000)* list.get(10000)* list.get(100000)* list.get(1000000));
	}
	
	public static ArrayList<Integer> split(int num)
	{
		ArrayList<Integer> splitList = new ArrayList<Integer>();
		
		do
		{
			splitList.add(0, num%10);
			num /=10;
		}while (num != 0);
		
		
		return splitList;
	}
}

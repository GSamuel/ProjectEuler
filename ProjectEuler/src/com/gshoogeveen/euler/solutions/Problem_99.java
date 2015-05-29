package com.gshoogeveen.euler.solutions;

import java.util.ArrayList;

import com.gshoogeveen.euler.input.ReadPoint;

public class Problem_99
{

	public static void main(String[] args)
	{
		ArrayList<int[]> points = ReadPoint.readPoints("p099_base_exp.txt");
		System.out.println(points.size());
	}

}

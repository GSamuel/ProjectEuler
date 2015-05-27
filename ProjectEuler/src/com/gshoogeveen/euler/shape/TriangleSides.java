package com.gshoogeveen.euler.shape;

public class TriangleSides
{
	private int a,b;
	private double c;
	
	public TriangleSides()
	{
		this.a = 0;
		this.b = 0;
		this.c = 0;
	}
	
	public TriangleSides(int a, int b)
	{
		setValue(a, b);
	}
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
		this.c = Math.sqrt(a*a+b*b);
	}
	
	public int getA()
	{
		return a;
	}
	
	public int getB()
	{
		return b;
	}
	
	public double getC()
	{
		return c;
	}
	
	
	public double length()
	{
		return a+b+c;
	}
	
	public String toString()
	{
		return "a:"+a+" b:"+b+" c:"+c+" len:"+length();
	}
	
	public TriangleSides clone()
	{
		return new TriangleSides(a,b);
	}
}

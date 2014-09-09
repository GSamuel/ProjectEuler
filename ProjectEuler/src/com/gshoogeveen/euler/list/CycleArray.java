package com.gshoogeveen.euler.list;

public class CycleArray<E>
{
	private E[] list;
	private int pos = -1;
	
	public CycleArray(E[] list)
	{
		this.list = list;
	}
	
	public E next()
	{
		pos++;
		if(pos>= list.length)
			pos-= list.length;
		return list[pos];
	}
}

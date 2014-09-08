package com.gshoogeveen.euler.date;

public enum Day
{
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATERDAY, SUNDAY;

	public Day getNext()
	{
		return values()[(ordinal() + 1) % values().length];
	}
	
	public Day getPrevious()
	{
		return values()[(ordinal()-1 + values().length) % values().length];
	}
}

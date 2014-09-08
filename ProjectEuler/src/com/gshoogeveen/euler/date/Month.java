package com.gshoogeveen.euler.date;

public enum Month
{
	JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;

	public Month getNext()
	{
		return values()[(ordinal() + 1) % values().length];
	}

	public Month getPrevious()
	{
		return values()[(ordinal() - 1 + values().length) % values().length];
	}
	
	public boolean isLastMonth()
	{
		return this == DECEMBER;
	}
	
	public boolean isFirstMonth()
	{
		return this == JANUARY;
	}

	public int getAmountOfDays(boolean leapYear)
	{
		switch (this)
		{
		case FEBRUARY:
			if (leapYear)
				return 29;
			else
				return 28;
		case APRIL:
		case JUNE:
		case SEPTEMBER:
		case NOVEMBER:
			return 30;
		default:
			return 31;
		}
	}
}

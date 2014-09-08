package com.gshoogeveen.euler.date;

public class Date
{
	private int year;
	private Month month;
	private int numday;
	private Day day;

	public Date(int year, Month month, int numday, Day day)
	{
		this.year = year;
		this.month = month;
		this.numday = numday;
		this.day = day;
	}
	
	public void nextDay()
	{
		numday++;
		day = day.getNext();
		if(numday > month.getAmountOfDays(isLeapYear()))
		{
			if(month.isLastMonth())
				year++;
			numday -= month.getAmountOfDays(isLeapYear());
			month = month.getNext();
		}
	}
	
	public void previousDay()
	{
		numday--;
		day = day.getPrevious();
		if(numday < 1)
		{
			if(month.isFirstMonth())
				year--;
			month = month.getPrevious();
			numday += month.getAmountOfDays(isLeapYear());
		}
	}
	
	public boolean isLeapYear()
	{
		if(year%400 == 0)
			return true;
		else if(year%100 == 0)
			return false;
		else if(year%4 == 0)
			return true;
		return false;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public Month getMonth()
	{
		return month;
	}
	
	public int getDayNumber()
	{
		return numday;
	}
	
	public Day getDay()
	{
		return day;
	}
	
	public void show()
	{
		System.out.println(this);
	}
	
	public String toString()
	{
		return day.name()+" "+numday+" "+month.name()+" "+year;
	}
}

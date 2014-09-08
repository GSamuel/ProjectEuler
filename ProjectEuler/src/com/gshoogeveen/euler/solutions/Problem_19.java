package com.gshoogeveen.euler.solutions;

import com.gshoogeveen.euler.date.Date;
import com.gshoogeveen.euler.date.Day;
import com.gshoogeveen.euler.date.Month;

public class Problem_19
{
	public static void main(String[] args)
	{
		Date date = new Date(1900, Month.JANUARY, 1, Day.MONDAY);
		//go to year 1901
		while(date.getYear() < 1901)
			date.nextDay();
		
		int sundays = 0;
		while(!(date.getYear()==2000 && date.getMonth() == Month.DECEMBER && date.getDayNumber() == 31))
		{
			date.nextDay();
			if(date.getDayNumber() == 1 && date.getDay() == Day.SUNDAY)
				sundays++;
		}
		System.out.println("amount of sundays that have past: "+sundays);
		
		date = new Date(1900, Month.JANUARY, 1, Day.MONDAY);
		while(!(date.getYear()==1992 && date.getMonth() == Month.DECEMBER && date.getDayNumber() == 17))
			date.nextDay();
		date.show();
		
	}
}

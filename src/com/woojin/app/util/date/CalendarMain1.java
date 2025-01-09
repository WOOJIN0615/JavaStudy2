package com.woojin.app.util.date;

import java.util.Date;
import java.util.Calendar;

public class CalendarMain1 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		Date date = calendar.getTime();
		System.out.println(date);
		
		int y = calendar.get(Calendar.YEAR);
		System.out.println(y);
		
		int h = calendar.get(Calendar.HOUR);
		System.out.println(h);
		
		int m = calendar.get(Calendar.MINUTE);
		System.out.println(m);
		 
		
		
	}
	
	

}

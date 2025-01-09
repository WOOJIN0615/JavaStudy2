package com.woojin.app.util.date;

import java.util.Calendar;

public class CalendarMain2 {

	public static void main(String[] args) {
		Calendar ca1 = Calendar.getInstance();
		
		Calendar ca2 = Calendar.getInstance();
		
		ca1.set(2001, 5, 15, 12, 10);
		ca2.set(2025, 0, 9, 12, 30);
		
		int i = ca1.get(ca1.MINUTE);
		int y = ca2.get(ca2.MINUTE);
		int result = y-i;
		
		System.out.println(result);
		
		long l1 = ca1.getTimeInMillis();
		long l2 = ca2.getTimeInMillis();
		System.out.println(l1);
		System.out.println(l2);
		long r = l2-l1;
		System.out.println(r/(1000*60*60)+"시간");

	}

}

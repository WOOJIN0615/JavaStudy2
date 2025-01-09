package com.woojin.app.util.date;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataFormatMain1 {

	public static void main(String[] args) throws Exception {
		Calendar calendar = Calendar.getInstance();
		//2025년 1월 9일 몇시 몇분 몇초
		//yyyy-mm-dd hh-mm-ss
		String pattern = "yyyy년 MM월 dd일 E HH:mm:mm";
		
		SimpleDateFormat sd = new SimpleDateFormat(pattern);
		String str = sd.format(calendar.getTime());
		System.out.println(str);
		
		String d = "2050.10.30";
		pattern = "yyyy.MM.dd";
		
		
		sd.applyPattern(pattern);
		
		Date date = sd.parse(d);
		
		

	}

}

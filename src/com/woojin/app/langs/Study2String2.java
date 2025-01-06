package com.woojin.app.langs;

public class Study2String2 {

	public static void main(String[] args) {
		String str="  ";
		System.out.println(str.length()); //문자열의 길이
		
		System.out.println(str.isEmpty()); //문자수가 0인것
		
		System.out.println(str.isBlank()); //문자수가 0 || 스페이스바로만 이루어진것
		
		//replace
		//변경
		String r = str.replace(" ", "a");
		System.out.println(str);
		System.out.println(r);
		
		//abc   Abc
		//대문자, 소문자로 전부 변경
		str="aBc";
		r = str.toUpperCase();
		System.out.println(str);
		System.out.println(r);
		
		r = str.toLowerCase();
		System.out.println(str);
		System.out.println(r);
		
		//문자열 = 문자 배열
		char [] ch = str.toCharArray();
		
		//공백 제거
		str=" winter ";
		System.out.println(str.length());
		System.out.println(str);
		r=str.trim();
		System.out.println(r);
		

	}

}

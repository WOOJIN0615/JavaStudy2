package com.woojin.app.langs;

public class Study2String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		
		int i=0;
		String name = "winter";
		char ch = name.charAt(2);
		System.out.println(ch);
		int hi = name.length();
		System.out.println(hi);
		
		for (i=0; i<name.length(); i++) {
			System.out.println(name.charAt(i));
		}
		
		//ch -> char -> 자동형변환
		int a = name.indexOf('l');
		System.out.println(a);
		a = name.indexOf("it");
		System.out.println(a);
		name.indexOf("t", 2);
		
		name = "jung woo jin";
		String find = "p";
		
		i=0;
		int count=0;
		while(i>=0) {
			i=name.indexOf(find, i);
			if(i>=0) {
				count++;
				i++;
			}
		}
		System.out.println(count+" 개 찾음");
		
		for(int j=0;j<name.length();j++) {
			if('l'==name.charAt(i)) {
				count++;
			}
		}

	}

}

package com.woojin.app.langs;

public class Wrapper4 {

	public static void main(String[] args) {
		int num=10;
		
		String str=Integer.toBinaryString(num);
		
		System.out.println(str);
		
		str = Integer.toHexString(num);
		System.out.println(str);
		
	}

}

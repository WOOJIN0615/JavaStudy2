package com.woojin.app.langs;

public class Study1Object {

	public static void main(String[] args) {
		Object object = new Object();
		//참조변수명.변수명, 메서드명
		String s = object.toString();
		
		System.out.println(s);
		System.out.println(object);
		ObjectTest ot = new ObjectTest();
		
		Object obj = new Object();
		
		boolean result = object.equals(obj);
		System.out.println(obj == object);
		System.out.println(result);
		
		String name = "winter";
		String name2 = new String("winter");
		System.out.println(name == name2);
		result = name.equals(name2);
		System.out.println(result);
		
		//=====================================
		ot.num1=10;
		ot.m1();
		String str = ot.toString();
		System.out.println(str);
		System.out.println(ot);
		System.out.println(name2);
		System.out.println(name2.hashCode()); //16진수를 10진수로 변환해서 출력
		
	}

}

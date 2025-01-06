package com.woojin.app.langs.ex1;

import java.util.Scanner;

public class PersonFactory {
	private Scanner sc;
	{
		
	}
	
	public PersonFactory() {
		this.sc = new Scanner(System.in);
	}
	
	public Person find(Person [] persons) {
		System.out.println("원하는 사용자의 이름을 입력하세요");
		String pname = sc.next();
		Person person=null;
		for (int i=0;i<persons.length; i++) {
			if(pname.equals(person)) {
				break;
			}
		}
		return person;
	}

}

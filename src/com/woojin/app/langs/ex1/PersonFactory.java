package com.woojin.app.langs.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonFactory {
	private Scanner sc;
	{
		
	}
	
	public PersonFactory() {
		this.sc = new Scanner(System.in);
	}
	
	public Person find(ArrayList<Person> ap) {
		System.out.println("원하는 사용자의 이름을 입력하세요");
		String pname = sc.next();
		for (int i=0;i<ap.size(); i++) {
			if(pname.equals(ap.get(i).getName())) {
				return ap.get(i);
			}
		}
		return null;  
	}

}

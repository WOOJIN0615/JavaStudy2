package com.woojin.app.langs.ex1;

import java.util.ArrayList;

public class PersonView {
	
	private void view() {
		System.out.println("이름\t전화번호\t이메일\t생년월일");
	}
	
	public void view(String message) {
		System.out.println(message);
	}
	
	public void view(Person person) {
		this.view();
		System.out.println(person.getName()+"\t");
		System.out.println(person.getPhone()+"\t");
		System.out.println(person.getEmail()+"\t");
		System.out.println(person.getBirth());
	}
	
	public void view (ArrayList<Person> ap) {
		System.out.println("이름\t전화번호\t이메일\t생년월일");
		for (int i=0; i<ap.size(); i++) {
			System.out.println(ap.get(i).getName()+"\t");
			System.out.println(ap.get(i).getPhone()+"\t");
			System.out.println(ap.get(i).getEmail()+"\t");
			System.out.println(ap.get(i).getBirth());
		}
	}
	

}

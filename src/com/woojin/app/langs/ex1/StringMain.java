package com.woojin.app.langs.ex1;

import java.util.ArrayList;

public class StringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//주소록
		//이름, 전화번호, 이메일, 생일
		//아이유, 010-1234-5678, iu@gmail.com, 1993-05-05
		PersonInfo pi = new PersonInfo();
		ArrayList<Person> ap= new ArrayList<>();
		PersonControler pc = new PersonControler();
		pc.start();

	}

}

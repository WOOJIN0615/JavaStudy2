package com.woojin.app.langs.ex1;

public class PersonInfo {
	
	private String data;
	
	public PersonInfo() {
		this.data="iu, 010-1234-5678, iu@naver.com, 99-05-05,";
		this.data=this.data+"winter, 010-2222-2222, winter@gmail.com, 01-01-01,";
		this.data=this.data+"suji, 010-3333-3333, suji@naver.com, 93-12-24,";
//		System.out.println(this.data);
	}
	
	//메서드명 init
	//data의 변수의 값을 파싱
	
	public Person [] init() {
		String [] datas = data.split(",");
		
		//Person 객체에 데이터를 대입
		
		//Person 객체들을 리턴
		Person [] persons = new Person[datas.length/4];
		int idx=0;
		for (int i=0; i<datas.length; i=i+4) {
			Person person = new Person();
			
			person.setName(datas[i]);
			person.setPhone(datas[++i]);
			person.setEmail(datas[++i]);
			person.setBirth(datas[++i]);
			persons[idx]=person;
			idx++;
		}
		
		return persons; 
		
	}

	public void init(Person[] persons) {
		// TODO Auto-generated method stub
		
	}


	
	
	
}

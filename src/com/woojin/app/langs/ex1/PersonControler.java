package com.woojin.app.langs.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonControler {
	
	private PersonInfo personinfo;
	private PersonView personview;
	
	public PersonControler() {
		
	}

	
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		//1. 주소록 초기화
		//2. 주소록 출력
		//3. 검색(이름)
		//6. 종료
		boolean check = true;
		PersonInfo pi = new PersonInfo();
		PersonView pv = new PersonView();
		PersonFactory pf = new PersonFactory();
		ArrayList<Person> ap = pi.init();
		StringMain sm = new StringMain();
		
		
		
		while(check) {
		System.out.println("원하는 번호를 입력하세요. 1. 주소록 초기화 2. 주소록 출력 3. 검색 6. 종료");
		int select = sc.nextInt();
			if (select==1) {
				ap=pi.init();
			}else if (select==2) {
				pv.view(ap);
			}else if (select==3) {
				Person person = pf.find(ap);
				if (person != null) {
					pv.view(person);
				}else {
					System.out.println("일치하는 사용자가 존재하지 않습니다.");
				}
			}else if (select==6) {
				System.out.println("주소록 종료");
				break;
			}
		
		}
		
		
		
		
	}
	}



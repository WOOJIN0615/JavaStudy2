package com.woojin.app.langs;

import java.util.Scanner;

public class Wrapper3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요.");
		String jumin = sc.next();//971226-1234567
		
		// 9  7  1  2  2  6  -  1  2  3  4  5  6  7  
		//*2  3  4  5  6  7     8  9  2  3  4  5    마지막번호는 검증용 번호
		//18+21+ 4 ...... 총합계
		//ex) 122
		//11로 나눈 나머지값 구하기 ex) 0~10
		//11-나머지 결과값 구하기
		//만약 나머지가 두자리라면 다시 10으로 나눈 나머지값을 구하기
		//나머지값이 검증용 번호와 일치한지 확인
		int x=2;
		int total = 0;
		int i=0;
		for (i=0; i<jumin.length()-1; i++) {
			if (x==10) {
				x=2;
			}
			char j = jumin.charAt(i);
			if (j=='-') {
				continue;
			}
			int n = Character.getNumericValue(j);
			System.out.println(n);
			total=total+(x*n);
			x++;
			}
		x=total%11;
		x=11-x;
		if (x>9) {
			x=x%10;
		}
		char last = jumin.charAt(13);
		int l = Character.getNumericValue(last);
		if (x==l) {
			System.out.println("올바른 주민번호입니다.");
		}else {
			System.out.println("올바르지 않은 주민번호입니다.");
		}
			
			
		
				
		
		
		
	}
}

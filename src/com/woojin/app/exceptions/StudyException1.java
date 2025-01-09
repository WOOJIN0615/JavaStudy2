package com.woojin.app.exceptions;

import java.util.Scanner;

public class StudyException1 {
	
	public void m1(Scanner sc) {
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		if (num != 0) {
			num=20/num;
			System.out.println(num);
		}else {
		System.out.println("0으로 나눌 수 없다  ");
		}
	}
	
	
}

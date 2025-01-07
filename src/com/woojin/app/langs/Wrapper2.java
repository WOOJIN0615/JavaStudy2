Stpackage com.woojin.app.langs;

import java.nio.IntBuffer;
import java.util.Scanner;

public class Wrapper2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호입력");
		String birth = sc.next();//971225-1234567
		
//		int input = Integer.parseInt(birth);
//		System.out.println(input);
		String month = "";
		String n = birth.substring(0, 2);
		String m = birth.substring(7, 8);
		String s = birth.substring(2, 4);
//		System.out.println(n);
//		System.out.println(m);
		int l = Integer.parseInt(m);
		if (l==1 || l==2) {
			n="19"+n;
		}else if (l==3 || l==4) {
			n="20"+n;
		}
		int o = Integer.parseInt(s);
		if (o>2 && o<6) {
			month = "봄";
		}else if (o>5 && o<9) {
			month = "여름";
		}else if (o>8 && o<12) {
			month = "가을";
		}else {
			month = "겨울";
		}
		 
		int i = Integer.parseInt(n);
		int age = 2025-i;
		System.out.println("현재 나이는 " + age + "살 입니다." + month);

		
		
	}

}

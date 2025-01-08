package com.woojin.app.utils.tokens;

import java.util.StringTokenizer;

public class TokenMain {

	public static void main(String[] args) {
		//클래스를 담을 변수 선언
		//같은 패키지 내에 있는가
		//또는 java.lang 내에 있는가
		
		//하나의 문자열을 여러개의 문자열로 분리
		//분리한 문자열 하나 하나를 Token
		String data="iu-167-48-서울";
		StringTokenizer st = new StringTokenizer(data,"-");
		int count=st.countTokens();
		System.out.println(count);
		
		boolean check=st.hasMoreTokens();
		
		while(st.hasMoreTokens()) {
			
			String str=st.nextToken();
			System.out.println(str);
			str=st.nextToken();
			System.out.println(str);
			
		}
		
		System.out.println(check);
	}

}

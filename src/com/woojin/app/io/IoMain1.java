package com.woojin.app.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Scanner;

public class IoMain1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//키보드로부터 데이터를 입력
		//0,1 -> h, e, l, l, o -> hello
		//0,1 관리
		InputStream is = System.in;
		//    v
		//문자 관리
		InputStreamReader ir = new InputStreamReader(is);
		//    v
		//보조 스트림(문자열 관리)
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("입력하세요.");
		
		try {
			String str = br.readLine();
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//예외의 발생유무에 상관없이 무조건 실행하는 영역 
			try {
				sc.close();
				br.close();
				ir.close();
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("프로그램 종료");

	}

}

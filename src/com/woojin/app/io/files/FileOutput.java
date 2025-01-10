package com.woojin.app.io.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput {
	


	public void add() {
		//도시, 기온, 습도, 날씨를 입력받아서
		//sample.txt에 추가
		Scanner sc = new Scanner(System.in);
		System.out.println("도시명을 입력하세요.");
		String city = sc.next();
		System.out.println("기온을 입력하세요.");
		int tem = sc.nextInt();
		System.out.println("습도를 입력하세요.");
		Double huminity = sc.nextDouble();
		System.out.println("날씨를 입력하세요.");
		String status = sc.next();
		//도시명-기온-습도-상태
		String data = city+"-"+tem+"-"+huminity+"-"+status;
		this.output(data);
		sc.close();
		
	}
	
	
//	public void write() {
//		Scanner sc = new Scanner(System.in);
//		boolean check = true;
//		System.out.println("입력");
//		while (check) {
//			String data = sc.next();
//			if (check) {
//				System.out.println("입력중... 종료를 원하시면 종료를 입력하세요");
//			}
//			else if (data.equals("종료")) { //String클래스끼리 비교할때는 equals구문을 이용
//				check=false;
//				System.out.println("종료되었습니다.");
//				break;
//			}
//			this.output(data);
//		}
//		
//		sc.close();		
//	}
	
	
	private void output(String data) {
		//파일의 내용을 출력
		File file = new File("C:\\test\\sample.txt");
		FileWriter fw = null;
		
		try {
			//false : 기존의 파일을 삭제
			//true : 기존의 파일에 내용 추가
			fw = new FileWriter(file, true);
			fw.write(data);
			//버퍼 초기화
			//버퍼를 강제로 비움
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

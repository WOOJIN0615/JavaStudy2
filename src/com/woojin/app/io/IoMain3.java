package com.woojin.app.io;

import java.io.File;

public class IoMain3 {

	public static void main(String[] args) {
		File file = new File("c:\\test", "Test.java");
		
		file = new File("c:\\test");
		
		
		File[] list = file.listFiles();
		for (int i=0; i<list.length; i++) {
//			System.out.println(list[i]);
			
			if (list[i].isDirectory()) {
				System.out.println(list[i]+"는 폴더입니다.");
			}else {
				System.out.println(list[i]+"는 파일입니다.");
			}
		}
             
 	}

}

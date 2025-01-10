package com.woojin.app.io.files;

import java.util.List;

public class FileMain {

	public static void main(String[] args) {
		
		
		
		FileOutput fo = new FileOutput();
		fo.add();
		FileInput fi = new FileInput();
		
		try {
			List<Weather> list = fi.input();
			for (Weather w : list) {
				w.info();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

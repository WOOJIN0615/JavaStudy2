package com.woojin.app.io.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FileInput     {
	
	
	
	public ArrayList<Weather> input() throws Exception {
		File file = new File("C:\\test\\sample.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		ArrayList<Weather> list = new ArrayList<>();
		FileOutput fo = new FileOutput();
		
		while (true) {
			String data = br.readLine();
			if (data==null) {
				System.out.println("프로그램 종료");
				break;
			}
			StringTokenizer st = new StringTokenizer(data, "-");
			
			while (st.hasMoreTokens()) {
				String d = st.nextToken();
				Weather w = new Weather();
				w.setCity(d);
				w.setTem(Integer.parseInt(d));
				w.setHuminity(Double.parseDouble(d));
				w.setStatus(d);
				
				list.add(w);
				//파싱한 값을 Weather에 삽입하고
				//Weather를 수집하여 리턴
				//main 메서드에 모든 내용을 출력.
				
				
			}
			
			
			
		}
		br.close();
		fr.close();
		return list;
	}

}

//				String [] str= {st.nextToken()};
//				for (int i=0; i<str.length; i++) {
//					int s = str.length/4;
//					w.setCity(str[i]);
//					w.setTem(Integer.parseInt(str[i++]));
//					w.setHuminity(Double.parseDouble(str[i++]));
//					w.setStatus(str[i++]);
//				}
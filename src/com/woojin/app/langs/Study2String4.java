package com.woojin.app.langs;

public class Study2String4 {

	public static void main(String[] args) {
		//하나의 문자열을 여러개의 문자열로 분리
		//50-60-70-80 => 50, 60, 70, 80
		//parsing
		String data = "50-60,70,80";
		
		data = data.replace('-', ',');
		
		String [] datas = data.split(",");
		
		for (int i=0; i<datas.length; i++) {
			System.out.println(datas[i]);
		}

	}

}

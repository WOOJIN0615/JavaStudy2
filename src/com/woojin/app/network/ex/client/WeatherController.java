package com.woojin.app.network.ex.client;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {
	
	
	public void start() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("서버와 접속 성공.");
		Socket socket = new Socket("192.168.200.25", 8282);
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		WeatherView view = new WeatherView();
		ArrayList<WeatherDTO> aw = new ArrayList<>();
		boolean check = true;
		//1. 날씨 정보 출력
		//2. 종료
		
		
		while (check) {
			System.out.println("1. 날씨 정보 출력  2. 종료");
			int select = sc.nextInt();
			if (select == 1) {
				view.view();
			}else if (select == 2) {
				System.out.println("프로그램이 종료됩니다.");
				check=false;
			}
		}
		
		
		
	}

}

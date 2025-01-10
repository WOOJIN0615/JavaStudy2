package com.woojin.app.network.ex.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) throws Exception {
		System.out.println("서버 시작");
		//1. 클라이언트에서 데이터받기
		//1이 오면 sample.txt에 있는 내용을 읽어서
		//한 줄로 만든 후 client로 전송
		ServerSocket ss = new ServerSocket(8282);
		System.out.println("클라이언트의 연결을 기다리는 중...");
		
		Socket socket = ss.accept();
		System.out.println("클라이언트와 연결 성공.");
		
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		String message = br.readLine();
		
		if (message.equals("1")) {
			
		}

	}

}

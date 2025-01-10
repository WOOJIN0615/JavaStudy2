package com.woojin.app.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class StudyServer {

	public static void main(String[] args) throws IOException {
		
		//클라이언트의 접속을 기다림.
		Scanner sc = new Scanner(System.in);
		ServerSocket ss = new ServerSocket(8282);
		System.out.println("클라이언트의 접속을 기다리는중....");
		
		//클라이언트와 1:1 Socket 연결
		Socket socket = ss.accept();
		System.out.println("클라이언트와 연결에 성공하였습니다.");
		
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		boolean check = true;
		
		while (check) {
		String message = br.readLine();
			if (message.equals("종료")) {
			check=false;
			}
		System.out.println("Client : "+message);
		System.out.println("서버로 보낼 메세지를 입력하세요.");
		
		message = sc.next();
			bw.write(message);
			bw.write("\r\n");
			bw.flush();
			if (message.equals("종료")) {
				check=false;
			}
			
		}
		br.close();
		ir.close();
		is.close();
		bw.close();
		ow.close();
		os.close();
		socket.close();
		ss.close();
		
		System.out.println("프로그램 종료");

	}

}

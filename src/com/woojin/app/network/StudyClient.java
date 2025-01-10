package com.woojin.app.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class StudyClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//ip:port
		//java ip+port = socket
		//서버에 접속
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("192.168.200.25", 8282);
		System.out.println("서버와 접속에 성공하였습니다.");
		
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		boolean check = true;
		
		while(check) {
		System.out.println("서버로 보낼 메세지를 입력하세요.");
		String message = sc.next();
		
		bw.write(message);
		bw.write("\r\n");
		bw.flush();
		
			if (message.equals("종료")) {
				check=false;
			}
		
				message = br.readLine();
			if (message.equals("종료")) {
					check=false;
				}
			System.out.println("Server : "+message);
			
		}
		bw.close();
		ow.close();
		os.close();
		br.close();
		ir.close();
		is.close();
		socket.close();
		
		System.out.println("클라이언트 종료");
		
	}

}
  
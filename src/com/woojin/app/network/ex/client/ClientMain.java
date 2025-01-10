package com.woojin.app.network.ex.client;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) throws Exception {
		System.out.println("클라이언트 시작");
		
		WeatherController wc = new WeatherController();
		
		wc.start();
		
	}

}

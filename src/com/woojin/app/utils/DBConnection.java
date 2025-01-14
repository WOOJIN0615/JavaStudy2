package com.woojin.app.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
	//DB에 접속
	
	public static Connection getConnection() throws Exception {
		System.out.println("DB 접속");
		String username = "hr";
		String password = "hr";
		String url = "jdbc:oracle:thin:@52.78.183.139:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		
			//1. driver를 메모리에 로딩(객체 생성)
			Class.forName(driver);
			
			//2. DB에 연결
			Connection connection = DriverManager.getConnection(url, username, password);
//			System.out.println(connection);
			
			return connection;
			
	}
	
	public static void disConnect(ResultSet rs, PreparedStatement ps, Connection connection) throws Exception {
		rs.close();
		ps.close();
		connection.close();
	}
		
	

}
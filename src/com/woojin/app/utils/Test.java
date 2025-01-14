package com.woojin.app.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {
	
	
	public void m1() {
		System.out.println("DB 접속");
		//1. 접속 정보 선언
		String username="hr";
		String password="hr";
		String url="jdbc:oracle:thin:@52.78.183.139:1521:xe";
		String driver="oracle.jdbc.driver.OracleDriver";
		
		try {
			Class.forName(driver);
			//2. Connection
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println(connection);
			
			//3. Query문
			String sql = "SELECT * FROM LOCATIONS WHERE LOCATION_ID=1000";
			
			//4. 미리 전송
			PreparedStatement ps = connection.prepareStatement(sql);
			
			//5. ?
			
			//6. 최종 전송 및 결과 처리
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString("STREET_ADDRESS"));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString("CITY"));
				System.out.println(rs.getString("COUNTRY_ID"));
			} else {
				System.out.println("데이터 없음");
			}
			//7. 자원 해제
			rs.close();
			ps.close();
			connection.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
}

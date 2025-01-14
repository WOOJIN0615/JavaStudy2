package com.woojin.app.locations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.woojin.app.utils.DBConnection;

public class LocationDAO {
		//1. 접속 정보 선언
		//2. connection
		//3. SQL문 생성
		//4. 미리 보내기
		//5. ?
		//6. 최종 전송 및 결과 처리
		//7. 연결 해제
	public void getList() throws Exception{
		Connection con = DBConnection.getConnection();
		String sql = "SELECT * FROM LOCATIONS ORDER BY 2 DESC";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			System.out.println(rs.getString("STREET_ADDRESS"));
		}
		DBConnection.disConnect(rs, ps, con);
		
	}
	
	
	public void getDetail() throws Exception {
		String sql = "SELECT * FROM LOCATIONS WHERE LOCATION_ID=1000";
		Connection connection = DBConnection.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		if (rs.next()) {
			System.out.println(rs.getString("STREET_ADDRESS"));
		}else {
			System.out.println("데이터 없음");
		}
		DBConnection.disConnect(rs, ps, connection);
	}

}

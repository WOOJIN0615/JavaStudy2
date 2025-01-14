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
		String sql = "SELECT * FROM LOCATIONS ORDER BY 4 DESC";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			System.out.println(rs.getString("CITY"));
		}
		DBConnection.disConnect(rs, ps, con);
		
	}
	
	
	public LocationDTO getDetail() throws Exception {
		LocationDTO locationDTO=null;
		Connection connection = DBConnection.getConnection();
		String sql = "SELECT * FROM LOCATIONS ORDER BY 2 DESC";
		PreparedStatement ps = connection.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		if (rs.next()) {
			locationDTO = new LocationDTO();
			locationDTO.setLocation_id(rs.getInt("LOCATION_ID"));
			locationDTO.setStreet_address(rs.getString("STREET_ADDRESS"));
			locationDTO.setPostal_code(rs.getString("POSTAL_CODE"));
			locationDTO.setCity(rs.getString("CITY"));
			locationDTO.setState_province(rs.getString("STATE_PROVINCE"));
			locationDTO.setCountry_id(rs.getString("COUNTRY_ID"));
		}
		DBConnection.disConnect(rs, ps, connection);
		
		return locationDTO;
	}

}

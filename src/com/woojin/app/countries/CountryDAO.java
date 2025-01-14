package com.woojin.app.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.woojin.app.utils.DBConnection;

public class CountryDAO {
	
	//1. 접속 정보 선언
		//2. connection
		//3. SQL문 생성
		//4. 미리 보내기
		//5. ?
		//6. 최종 전송 및 결과 처리
		//7. 연결 해제
	
	public void getList() throws Exception {
		Connection conn = DBConnection.getConnection();
		String sql = "SELECT * FROM COUNTRIES ORDER BY 1 ASC";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getString("COUNTRY_ID"));
		}
		DBConnection.disConnect(rs, ps, conn);
	}
	
	public CountryDTO getDetail() throws Exception {
		CountryDTO countryDTO=null;
		Connection conn = DBConnection.getConnection();
		String sql = "SELECT * FROM COUNTRIES ORDER BY 2 DESC";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		if (rs.next()) {
			countryDTO = new CountryDTO();
			countryDTO.setCountry_id(rs.getString("COUNTRY_ID"));
			countryDTO.setCountry_name(rs.getString("COUNTRY_NAME"));
			countryDTO.setRegion_id(rs.getInt("REGION_ID"));
		}
		DBConnection.disConnect(rs, ps, conn);
		
		return countryDTO;
	}

}

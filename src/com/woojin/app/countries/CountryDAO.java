package com.woojin.app.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.woojin.app.utils.DBConnection;

public class CountryDAO {
	
	//1. 접속 정보 선언
		//2. connection
		//3. SQL문 생성
		//4. 미리 보내기
		//5. ?
		//6. 최종 전송 및 결과 처리
		//7. 연결 해제
	
	public List<CountryDTO> getList() throws Exception {
		Connection conn = DBConnection.getConnection();
		String sql = "SELECT * FROM COUNTRIES ORDER BY 1 ASC";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		List<CountryDTO> ar = new ArrayList<>();
		
		while (rs.next()) {
			CountryDTO countryDTO = new CountryDTO();
			countryDTO.setCountry_id(rs.getString("COUNTRY_ID"));
			countryDTO.setCountry_name(rs.getString("COUNTRY_NAME"));
			countryDTO.setRegion_id(rs.getInt("REGION_ID"));
			ar.add(countryDTO);
		}
		DBConnection.disConnect(rs, ps, conn);
		
		return ar;
	}
	
	public CountryDTO getDetail(CountryDTO countryDTO2) throws Exception {
		CountryDTO countryDTO=null;
		Connection conn = DBConnection.getConnection();
		String sql = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		
		ps.setString(1, countryDTO2.getCountry_id());
		
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

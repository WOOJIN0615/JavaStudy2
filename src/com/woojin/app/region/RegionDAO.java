package com.woojin.app.region;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.woojin.app.utils.DBConnection;

public class RegionDAO {
			//1. 접속 정보 선언
			//2. connection
			//3. SQL문 생성
			//4. 미리 보내기
			//5. ?
			//6. 최종 전송 및 결과 처리
			//7. 연결 해제
	Scanner sc = new Scanner(System.in);
	public List<RegionDTO> getList() throws Exception {
		Connection conn = DBConnection.getConnection();
		String sql = "SELECT * FROM REGIONS ORDER BY 1 DESC";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		
		ResultSet rs = ps.executeQuery();
		
		List<RegionDTO> ar = new ArrayList<>();
		
		while (rs.next()) {
			RegionDTO regionDTO = new RegionDTO();
			regionDTO.setRegion_id(rs.getInt("REGION_ID"));
			regionDTO.setRegion_name(rs.getString("REGION_NAME"));
			ar.add(regionDTO);
			
		}
		DBConnection.disConnect(rs, ps, conn);
		
		return ar;
	}
	
	public RegionDTO getDetail(RegionDTO regionDTO2) throws Exception {
		RegionDTO regionDTO = null;
		Connection conn = DBConnection.getConnection();
		String sql = "SELECT * FROM REGIONS WHERE REGION_ID=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setInt(1, regionDTO2.getRegion_id());
		
		ResultSet rs = ps.executeQuery();
		
		
		
		if (rs.next()) {
			regionDTO=new RegionDTO();
			regionDTO.setRegion_id(rs.getInt("REGION_ID"));
			regionDTO.setRegion_name(rs.getString("REGION_NAME"));
		}
		DBConnection.disConnect(rs, ps, conn);
		
		return regionDTO;
	}
}

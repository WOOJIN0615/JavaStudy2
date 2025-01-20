package com.woojin.app.departments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.woojin.app.utils.DBConnection;

public class DepartmentDAO {
	//DAO -> Data Access Object
	//DB의 Data를 조회, 입력, 수정, 삭제
	
	//1. 접속 정보 선언
	//2. connection
	//3. SQL문 생성
	//4. 미리 보내기
	//5. ?
	//6. 최종 전송 및 결과 처리
	//7. 연결 해제
	public List<DepartmentDTO> getList() throws Exception {
		Connection con = DBConnection.getConnection();
		String sql = "SELECT * FROM DEPARTMENTS ORDER BY 2 DESC";
		PreparedStatement ps = con.prepareStatement(sql);
		
		
		ResultSet rs = ps.executeQuery();
		
		List<DepartmentDTO> ar = new ArrayList<>();
		
		while (rs.next()) {
			DepartmentDTO departmentDTO = new DepartmentDTO();
			departmentDTO.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
			departmentDTO.setDepartment_name(rs.getString("DEPARTMENT_NAME"));
			departmentDTO.setManager_id(rs.getInt("MANAGER_ID"));
			departmentDTO.setLocation_id(rs.getInt("LOCATION_ID"));
			ar.add(departmentDTO);
		}
		
		DBConnection.disConnect(rs, ps, con);
		
		return ar;
		
	}
	
	public DepartmentDTO getDetail(DepartmentDTO departmentDTO2) throws Exception {
		DepartmentDTO departmentDTO=null;
		Connection connection = DBConnection.getConnection();
		String sql = "SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID=?";
		PreparedStatement st = connection.prepareStatement(sql);
		
		//? 값을 세팅
		st.setInt(1, departmentDTO2.getDepartment_id());
		
		ResultSet rs=st.executeQuery();
		
		if (rs.next()) {
			departmentDTO = new DepartmentDTO();
			departmentDTO.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
			departmentDTO.setDepartment_name(rs.getString("DEPARTMENT_NAME"));
			departmentDTO.setManager_id(rs.getInt("MANAGER_ID"));
			departmentDTO.setLocation_id(rs.getInt("LOCATION_ID"));
		}
		DBConnection.disConnect(rs, st, connection);
		
		return departmentDTO;
	}
	
	public DepartmentDTO getName() throws Exception {
		Connection conn = DBConnection.getConnection();
		String sql = "SELECT LOCATION_ID FROM DEPARTMENTS WHERE DEPARTMENT_ID=(SELECT department_id FROM EMPLOYEES WHERE FIRST_NAME = 'Lex')";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		DepartmentDTO departmentDTO=null;
		
		if (rs.next()) {
			departmentDTO = new DepartmentDTO();
			departmentDTO.setDepartment_name(rs.getString("DEPARTMENT_NAME"));
		}
		
		DBConnection.disConnect(rs, ps, conn);
		  
		return departmentDTO;
	}
	
	//Insert
	public int add(DepartmentDTO departmentDTO) throws Exception{
		Connection conn = DBConnection.getConnection();
		
		String sql = "INSERT INTO DEPARTMENTS (DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID)"
				+ " VALUES (DEPARTMENTS_SEQ.NEXTVAL, ?, ?, ?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1, departmentDTO.getDepartment_name());
		ps.setInt(2, departmentDTO.getManager_id());
		ps.setInt(3, departmentDTO.getLocation_id());
		
		//최종 전송 (INSERT, UPDATE, DELETE)
		//결과 int , 메서드 executeUpdate
		int result = ps.executeUpdate();
		
		DBConnection.disConnect(ps, conn);
		
		return result;
	}
	
	public int update(DepartmentDTO departmentDTO) throws Exception {
		//하나의 부서에 매니저 번호를 수정
		Connection conn = DBConnection.getConnection();
		
		String sql = "UPDATE DEPARTMENTS SET MANAGER_ID=?"
				+ " WHERE DEPARTMENT_ID=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setInt(1, departmentDTO.getManager_id());
		ps.setInt(2, departmentDTO.getDepartment_id());
		
		int result = ps.executeUpdate();
		
		DBConnection.disConnect(ps, conn);
		
		return result;
	}
	
	public int delete(DepartmentDTO departmentDTO) throws Exception {
		Connection conn = DBConnection.getConnection();
		
		String sql = "DELETE DEPARTMENTS WHERE DEPARTMENT_ID=?";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setInt(1, departmentDTO.getDepartment_id());
		
		int result = ps.executeUpdate();
		
		DBConnection.disConnect(ps, conn);
		
		return result;
	}
	
}

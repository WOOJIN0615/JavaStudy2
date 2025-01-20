package com.woojin.app.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.woojin.app.utils.DBConnection;

public class EmployeeDAO {
	
	public Map<String, Object> getInfo() throws Exception {
		//부서별, 부서번호, 평균월급, 사원수,
		Connection con = DBConnection.getConnection();
		
		String sql = "SELECT AVG(SALARY) a, COUNT(EMPLOYEE_ID)"
				+ " FROM EMPLOYEES"
				+ " GROUP BY DEPARTMENT_ID";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		List<Map<String, Object>> ar = new ArrayList<>();
		while(rs.next()) {
			Map<String, Object> map = new HashMap<>();	
			map.put("avg", rs.getDouble("a"));
			map.put("count", rs.getInt(2));
			ar.add(map);
		}
		
		DBConnection.disConnect(rs, st, con);
		
		return null;
		
		
		
	}
	
	
	public List<EmployeeDTO> getList(String search)throws Exception{
		List<EmployeeDTO> ar = new ArrayList<>();
		
		//1.DB연결
		Connection con = DBConnection.getConnection();
		
		//2. SQL문 생성
		String sql ="SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID FROM EMPLOYEES"
				+ " WHERE LAST_NAME LIKE '%'||?||'%'";
		
		//3. 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. ? 값 세팅
		st.setString(1, search);
		
		//5. 최종 전송 및 결과 처리
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			EmployeeDTO employeeDTO = new EmployeeDTO();
			employeeDTO.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
			employeeDTO.setLast_name(rs.getString("LAST_NAME"));
			employeeDTO.setJob_id(rs.getString("JOB_ID"));
			ar.add(employeeDTO);
		}
		
		//6.자원 해제
		DBConnection.disConnect(rs, st, con);
		
		return ar;
	}

}

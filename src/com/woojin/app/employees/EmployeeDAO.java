package com.woojin.app.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.woojin.app.departments.DepartmentDTO;
import com.woojin.app.utils.DBConnection;

public class EmployeeDAO {
	//어떤 것을 조회할 것인지.
	private DepartmentDTO departmentDTO;
	
	public List<Map<String, Object>> getInfo() throws Exception {
		//부서별, 부서번호, 평균월급, 사원수
		Connection conn = DBConnection.getConnection();
		String sql = "SELECT AVG(SALARY), COUNT(SALARY) FROM EMPLOYEES";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<Map<String, Object>> ar = new ArrayList<>();
		while(rs.next()) {
			Map<String, Object> map = new HashMap<>();
			map.put("avg", rs.getDouble("AVG(SALARY)"));
			map.put("count", rs.getInt(2));
			ar.add(map);
		}
		DBConnection.disConnect(rs, ps, conn);
		return ar;
		
		
	}
	
	public List<EmployeeDTO> getList(String search) throws Exception {
		List<EmployeeDTO> ar = new ArrayList<>();
		
		Connection con = DBConnection.getConnection();
		String sql = "SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID FROM EMPLOYEES"
				+ " WHERE LAST_NAME LIKE '%'||?||'%'";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, search);
		
		ResultSet rs = ps.executeQuery(); //execute : 실행
		
		while (rs.next()) {
			EmployeeDTO employeeDTO = new EmployeeDTO();
			
			employeeDTO.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
			employeeDTO.setLast_name(rs.getString("LAST_NAME"));
			employeeDTO.setJob_id(rs.getString("JOB_ID"));
			
			ar.add(employeeDTO);
		}
		
		return ar;
	}
	
	public void getInfo2() throws Exception {
		Connection con = DBConnection.getConnection();
		String sql = "SELECT E.employee_id, e.salary, e.job_id, d.department_name, e.DEPARTMENT_ID "
				+ "FROM EMPLOYEES e "
				+ "	JOIN "
				+ "	DEPARTMENTS "
				+ "	ON E.DEPARTMENT_ID = D.DEPARTMENT_ID "
				+ "WHERE e.first_name='Lex'";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		EmployeeDTO employeeDTO=null;
		if (rs.next()) {
			employeeDTO = new EmployeeDTO();
			employeeDTO.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
			employeeDTO.setSalary(rs.getDouble("SALARY"));
			employeeDTO.setJob_id(rs.getString("JOB_ID"));
			employeeDTO.setDepartmentDTO(new DepartmentDTO());
			employeeDTO.getDepartmentDTO().setDepartment_name("DEPARTMENT_NAME");
			
		}
	}

}

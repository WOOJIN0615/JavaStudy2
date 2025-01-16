package com.woojin.app.tests;

import com.woojin.app.departments.DepartmentDAO;
import com.woojin.app.departments.DepartmentDTO;

public class DepartmentDAOTest {
	
	private DepartmentDAO departmentDAO;
	
	public DepartmentDAOTest() {
		departmentDAO = new DepartmentDAO();
	}
	public void getNameTest() throws Exception{
		DepartmentDTO departmentDTO = departmentDAO.getName();
		System.out.println(departmentDTO.getDepartment_name());
	}
}

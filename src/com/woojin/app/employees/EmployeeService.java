package com.woojin.app.employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EmployeeService {
	
	//의존성(Defendency)
	private EmployeeDAO employeeDAO;
	
	public EmployeeService() {
		//의존성 주입(Defendency injection: DI)
		employeeDAO = new EmployeeDAO();
	}
	
	//list
	public List<EmployeeDTO> getList(Scanner sc) throws Exception {
		//DAO에서 getList를 호출하면 ar값을 리턴.
		System.out.println("검색어 입력");
		String search = sc.next();
		
		List<EmployeeDTO> ar = employeeDAO.getList(search);
		
			
		return ar;
	}
	
//	public Map<String, Object> getInfo() throws Exception {
//		Map<String, Object> map = employeeDAO.getInfo();
//		boolean check = true;
//		Set<String> keyset = map.keySet();
//		for (String key : keyset) {
//			System.out.println(key + " : " + map.get(key));
//		}
//		
//		return map;
//	}
	
	
}

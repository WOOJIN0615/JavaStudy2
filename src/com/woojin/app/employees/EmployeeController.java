package com.woojin.app.employees;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EmployeeController {
	
	//employeeService에 의존적임
	private EmployeeService employeeService;
	private EmployeeView employeeView;
	
	public EmployeeController() {
		employeeService = new EmployeeService();
		employeeView = new EmployeeView();
	}
	
	public void start() throws Exception {
		Scanner sc = new Scanner(System.in);
		boolean check=true;
		
		while(check) {
			System.out.println("1. 사원 목록 출력");
			System.out.println("2. test");
			System.out.println("3. 종료");
			int select=sc.nextInt();
			if (select==1) {
				List<EmployeeDTO> ar=employeeService.getList(sc);
				employeeView.View(ar);
			}else if (select==2) {
				Map<String, Object> map=employeeService.getInfo();
			}
			else {
				break;
			}
			
		}
	}
}

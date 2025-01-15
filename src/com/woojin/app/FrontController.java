package com.woojin.app;

import java.util.Scanner;

import com.woojin.app.countries.CountryController;
import com.woojin.app.departments.DepartmentController;
import com.woojin.app.employees.EmployeeController;
import com.woojin.app.locations.LocationController;
import com.woojin.app.region.RegionController;

public class FrontController {
	
	private DepartmentController departmentController;
	private LocationController locationController;
	private CountryController countryController;
	private RegionController regionController;
	private EmployeeController employeeController;
	
	public FrontController() {
		departmentController = new DepartmentController();
		locationController = new LocationController();
		countryController = new CountryController();
		regionController = new RegionController();
		employeeController = new EmployeeController();
	}
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		while(check) {
				try {
					System.out.println("1. 부서 관리");
					System.out.println("2. 지역 관리");
					System.out.println("3. 국가 관리");
					System.out.println("4. 대륙 관리");
					System.out.println("5. 직원 관리");
					System.out.println("6. 종료");
					int select = sc.nextInt();
					
					if (select==1) {
						departmentController.start();
					}else if (select==2) {
						locationController.start();
					}else if (select==3) {
						countryController.start();
					}else if (select==4) {
						regionController.start();
					}else if (select==5) {
						employeeController.start();
					}else {
						break;
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}//while 
	}//start()
}//class

package com.woojin.app;

import java.util.Scanner;

import com.woojin.app.countries.CountryController;
import com.woojin.app.departments.DepartmentController;
import com.woojin.app.locations.LocationController;

public class FrontController {
	
	private DepartmentController departmentController;
	private LocationController locationController;
	private CountryController countryController;
	
	public FrontController() {
		departmentController = new DepartmentController();
		locationController = new LocationController();
		countryController = new CountryController();
	}
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		while(check) {
				try {
					System.out.println("1. 부서 관리");
					System.out.println("2. 지역 관리");
					System.out.println("3. 국가 관리");
					System.out.println("4. 종료");
					int select = sc.nextInt();
					
					if (select==1) {
						departmentController.start();
					}else if (select==2) {
						locationController.start();
					}else if (select==3) {
						countryController.start();
					}else {
						break;
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}//while 
	}//start()
}//class

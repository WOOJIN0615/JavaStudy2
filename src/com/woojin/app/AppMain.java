package com.woojin.app;

import com.woojin.app.departments.DepartmentController;
import com.woojin.app.departments.DepartmentDAO;
import com.woojin.app.locations.LocationController;
import com.woojin.app.locations.LocationDAO;
import com.woojin.app.utils.DBConnection;
import com.woojin.app.utils.Test;

public class AppMain {

	public static void main(String[] args) {
		System.out.println("프로그램 실행");
//		DBConnection dc = new DBConnection();
//		dc.getConnection();
		
//		Test test = new Test();
//		test.m1();
		DepartmentDAO dd = new DepartmentDAO();
		LocationDAO ld = new LocationDAO();
		DepartmentController dc = new DepartmentController();
		LocationController lc = new LocationController();
		FrontController fc = new FrontController();
		
		try {
			fc.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}

}

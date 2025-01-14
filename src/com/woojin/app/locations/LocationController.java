package com.woojin.app.locations;

import java.util.Scanner;

public class LocationController {
	
	private LocationDAO locationDAO;
	
	private LocationView locationView;
	
	public LocationController() {
		locationDAO = new LocationDAO();
		locationView = new LocationView();
	}
	
	public void start() throws Exception {
		locationDAO = new LocationDAO();
		boolean check=true;
		Scanner sc = new Scanner(System.in);
		
		while (check) {
			System.out.println("1. 위치 정보 출력");
			System.out.println("2. 위치 상세 정보 출력");
			System.out.println("3. 종료");
			int select = sc.nextInt();
			if (select==1) {
				locationDAO.getList();
			}else if (select==2) {
				
				LocationDTO locationDTO = locationDAO.getDetail();
				
				if (locationDTO != null) {					
					locationView.view(locationDTO);
				}else {
					locationView.view("존재하지 않는 지역입니다.");
				}
			}else {
				break;
			}
		}
	}
}

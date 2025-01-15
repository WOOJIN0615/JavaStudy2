package com.woojin.app.locations;

import java.util.List;
import java.util.Scanner;

public class LocationController {
	
	private LocationService locationService;
	
	private LocationView locationView;
	
	public LocationController() {
		locationService = new LocationService();
		locationView = new LocationView();
	}
	
	public void start() throws Exception {
		locationService = new LocationService();
		boolean check=true;
		Scanner sc = new Scanner(System.in);
		
		while (check) {
			System.out.println("1. 위치 정보 출력");
			System.out.println("2. 위치 상세 정보 출력");
			System.out.println("3. 종료");
			int select = sc.nextInt();
			if (select==1) {
				List<LocationDTO> ar = locationService.getList();
				locationView.view(ar);
			}else if (select==2) {
				
				LocationDTO locationDTO = locationService.getDetail(sc);
				
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

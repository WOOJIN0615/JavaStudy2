package com.woojin.app.countries;

import java.util.Scanner;

import com.woojin.app.utils.DBConnection;

public class CountryController {
	
	
	private CountryDAO countryDAO;
	
	private CountryView countryView;
	
	public CountryController() {
		countryDAO = new CountryDAO();
		countryView = new CountryView();
	}
	
	public void start() throws Exception {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		while(check) {
			System.out.println("1. 국가 정보 출력");
			System.out.println("2. 국가 상세 정보 출력");
			System.out.println("3. 종료");
			int select = sc.nextInt();
			if (select==1) {
				countryDAO.getList();
			}else if (select==2) {
				CountryDTO countryDTO=countryDAO.getDetail();
				
				if (countryDTO != null) {
					countryView.view(countryDTO);
				}else {
					countryView.view("존재하지 않는 국가입니다.");
				}
				
			}else {
				break;
			}
		}
	}
	
}

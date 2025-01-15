package com.woojin.app.locations;

import java.util.List;

public class LocationView {
	
	public void view (String message) {
		System.out.println(message);
	}
	
	public void view (LocationDTO locationDTO) {
		System.out.println("위치코드\t거리명\t우편번호\t도시명\t주이름\t국가코드");
		System.out.print(locationDTO.getLocation_id()+"\t");
		System.out.print(locationDTO.getStreet_address()+"\t");
		System.out.print(locationDTO.getPostal_code()+"\t");
		System.out.print(locationDTO.getCity()+"\t");
		System.out.print(locationDTO.getState_province()+"\t");
		System.out.println(locationDTO.getCountry_id());
	}
	
	public void view (List<LocationDTO> ar) {
		System.out.println("위치코드\t거리명\t우편번호\t도시명\t주이름\t국가코드");

		for (LocationDTO locationDTO:ar) {
			System.out.print(locationDTO.getLocation_id()+"\t");
			System.out.print(locationDTO.getStreet_address()+"\t");
			System.out.print(locationDTO.getPostal_code()+"\t");
			System.out.print(locationDTO.getCity()+"\t");
			System.out.print(locationDTO.getState_province()+"\t");
			System.out.println(locationDTO.getCountry_id());
		}
	}
}

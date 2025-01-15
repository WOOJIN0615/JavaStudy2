package com.woojin.app.region;

import java.util.List;

public class RegionView {
	public void view(String message) {
		System.out.println(message);
	}
	
	public void view(RegionDTO regionDTO) {
		System.out.println("대륙코드\t대륙명");
		System.out.print(regionDTO.getRegion_id()+"\t");
		System.out.println(regionDTO.getRegion_name());
	}
	
	public void view(List<RegionDTO> ar) {
		System.out.println("대륙코드\t대륙명");
		
		for (RegionDTO regionDTO:ar) {
			System.out.print(regionDTO.getRegion_id()+"\t");
			System.out.println(regionDTO.getRegion_name());
		}
	}
}

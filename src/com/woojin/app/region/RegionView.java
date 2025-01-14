package com.woojin.app.region;

public class RegionView {
	public void view(String message) {
		System.out.println(message);
	}
	
	public void view(RegionDTO regionDTO) {
		System.out.println(regionDTO.getRegion_id()+"\t");
		System.out.println(regionDTO.getRegion_name()+"\t");
	}
}

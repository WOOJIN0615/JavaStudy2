package com.woojin.app.region;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegionService {
	
	RegionDAO regionDAO = new RegionDAO();
	
	public List<RegionDTO> getList() throws Exception {
		List<RegionDTO> ar = regionDAO.getList();
		
		return ar;
	}
	
	public RegionDTO getDetail(Scanner sc) throws Exception {
		System.out.println("조회할 대륙 번호 입력");
		
		RegionDTO regionDTO = new RegionDTO();
		
		regionDTO.setRegion_id(sc.nextInt());
		
		regionDTO = regionDAO.getDetail(regionDTO);
		
		return regionDTO;
	}
}

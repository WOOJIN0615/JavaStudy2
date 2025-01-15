package com.woojin.app.countries;

import java.util.List;
import java.util.Scanner;

public class CountryService {
	
	private CountryDAO countryDAO = new CountryDAO();
	
	public List<CountryDTO> getList() throws Exception {
		List<CountryDTO> ar  = countryDAO.getList();
		
		return ar;
	}
	
	public CountryDTO getDetail(Scanner sc) throws Exception {
		System.out.println("조회할 도시 코드 입력");
		
		CountryDTO countryDTO = new CountryDTO();
		
		countryDTO.setCountry_id(sc.next());
		
		countryDTO = countryDAO.getDetail(countryDTO);
		
		return countryDTO;
	}
}

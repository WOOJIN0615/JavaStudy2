package com.woojin.app.langs.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherView {
	
	private void view() {
		System.out.println("도시명\t기온\t습도\t날씨");
	}
	
	public void view(String message) {
		System.out.println(message);
		
	}
	
	public void view(WeatherDTO weatherDTO) {
		this.view();
		System.out.print(weatherDTO.getCity()+"\t");
		System.out.print(weatherDTO.getTem()+"\t");
		System.out.print(weatherDTO.getHumidity()+"\t");
		System.out.println(weatherDTO.getStatus());
	}
	
	public void view(ArrayList<WeatherDTO> ar) {
		//WeatherDTO에 있는 정보를 출력
		System.out.println("도시명\t기온\t습도\t날씨");
		
		for(int i=0; i<ar.size(); i++) {
			System.out.print(ar.get(i).getCity()+"\t");
			System.out.print(ar.get(i).getTem()+"\t");
			System.out.print(ar.get(i).getHumidity()+"\t");
			System.out.println(ar.get(i).getStatus());
		}
		
	}

}

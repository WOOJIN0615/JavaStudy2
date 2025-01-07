package com.woojin.app.langs.ex2;

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
	
	public void view(WeatherDTO [] dtos) {
		//WeatherDTO에 있는 정보를 출력
		System.out.println("도시명\t기온\t습도\t날씨");
		
		for(int i=0; i<dtos.length; i++) {
			System.out.print(dtos[i].getCity()+"\t");
			System.out.print(dtos[i].getTem()+"\t");
			System.out.print(dtos[i].getHumidity()+"\t");
			System.out.println(dtos[i].getStatus());
		}
		
	}

}

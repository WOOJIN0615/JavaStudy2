package com.woojin.app.langs.ex2;

public class Ex2Main {

	public static void main(String[] args) {
//		WeatherInfo wi = new WeatherInfo();
//		
//		WeatherView view = new WeatherView();
//		WeatherDTO[] dtos = wi.init();
//		view.view(dtos);
		
		WeatherController wc = new WeatherController();
		wc.start();

	}

}

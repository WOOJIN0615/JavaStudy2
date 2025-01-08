package com.woojin.app.langs.ex2;

import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class WeatherInfo {
	private Scanner sc;
	{
		
	}
	

	private StringBuffer info;
	// info의 정보를 파싱해서
	// WeatherDTO에 담아서
	// WeatherDTO들을 리턴.

	public WeatherInfo() {
		this.info = new StringBuffer();
		this.info.append("seoul, 10, 0.3, 맑음,");
		this.info.append("Ilsan, -12, 0.56, 흐림,");
		this.info.append("Incheon* 32* 0.95* 무더위,");
		this.info.append("Jeju* 56* 0.02* 건조");
	}
	
	public WeatherDTO[] init() {
		int i=0;
		String data=info.toString();
		data=data.replace("*", ",");
		StringTokenizer datas = new StringTokenizer(data, ",");
		WeatherDTO[] weatherDTOs = new WeatherDTO[datas.countTokens()/4];
		
		int idx=0; //배열의 인덱스 번호로 사용
		
		while(datas.hasMoreTokens()) {
			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setCity(datas.nextToken().trim());
			weatherDTO.setTem(Integer.parseInt(datas.nextToken().trim()));
			weatherDTO.setHumidity(Double.parseDouble(datas.nextToken().trim()));
			weatherDTO.setStatus(datas.nextToken().trim());
			weatherDTOs[idx]=weatherDTO;
			idx++;
		}
		
		return weatherDTOs;
		
	}

	public WeatherDTO[] init_old() {
		int i = 0;
		String data = info.toString();
		data = data.replace("*", ",");
		String[] datas = data.split(",");
		WeatherDTO[] dtos = new WeatherDTO[datas.length / 4];
		for (i = 0; i < datas.length; i++) {
			WeatherDTO weatherDTO = new WeatherDTO();
			dtos[i / 4] = weatherDTO;
			weatherDTO.setCity(datas[i].trim());
			weatherDTO.setTem(Integer.parseInt(datas[++i].trim()));
			weatherDTO.setHumidity(Double.parseDouble(datas[++i].trim()));
			weatherDTO.setStatus(datas[++i]);
		}
		return dtos;
	}
	
	public WeatherDTO find(WeatherDTO[] dtos, Scanner sc) {
		System.out.println("검색할 도시명을 입력하세요");
		String name = sc.next();
		for (int i=0; i<dtos.length; i++) {
			if (name.equals(dtos[i].getCity())) {
				return dtos[i];
			}
		}
		
		return null;
	}
	
	public WeatherDTO add(WeatherDTO[] dtos, Scanner sc) {
		System.out.println("추가할 도시명을 입력하세요");
		String cname = sc.next();
		System.out.println("도시의 기온을 입력하세요");
		int ctem = sc.nextInt();
		System.out.println("도시의 습도를 입력하세요");
		double cHumidity = sc.nextDouble();
		System.out.println("도시의 날씨를 입력하세요");
		String cstatus = sc.next();
		this.info=new StringBuffer();
		this.info.append(cname+", "+ctem+", "+cHumidity+", "+cstatus);
		
		WeatherDTO[] newdtos = new WeatherDTO[dtos.length+1];
		
		for (int i=0; i<dtos.length; i++) {
			newdtos[i] = dtos[i];
		}
		
		WeatherDTO newdto = new WeatherDTO();
		newdto.setCity(cname);
		newdto.setTem(ctem);
		newdto.setHumidity(cHumidity);
		newdto.setStatus(cstatus);
		
		return newdto;
	}

}

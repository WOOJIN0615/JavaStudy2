package com.woojin.app.network.ex.client;

public class WeatherDTO {
	
	private String city;
	private int tem;
	private double huminity;
	private String status;
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getTem() {
		return tem;
	}
	public void setTem(int tem) {
		this.tem = tem;
	}
	public double getHuminity() {
		return huminity;
	}
	public void setHuminity(double huminity) {
		this.huminity = huminity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}

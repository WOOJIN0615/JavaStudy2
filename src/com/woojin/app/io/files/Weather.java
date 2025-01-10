package com.woojin.app.io.files;

public class Weather {
	
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
	
	public void info() throws Exception {
		//멤버변수의 값을 출력하는 메서드
		System.out.println(this.city);
		System.out.println(this.tem);
		System.out.println(this.huminity);
		System.out.println(this.status);
		System.out.println("=========================");
		
	}

}

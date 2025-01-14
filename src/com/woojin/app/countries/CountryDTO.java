package com.woojin.app.countries;

public class CountryDTO {
	//DTO를 선언하는 규칙
	//모든 멤버변수의 접근지정자는 private
	//Getter, Setter
	//기본생성자(매개변수가 없는 생성자)는 필수
	//멤버변수명은 대응하는 테이블의 컬럼명과 데이터 타입 동일
	
	private String country_id;
	private String country_name;
	private int region_id;
	
	
	public String getCountry_id() {
		return country_id;
	}
	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public int getRegion_id() {
		return region_id;
	}
	public void setRegion_id(int region_id) {
		this.region_id = region_id;
	}
}

package com.goethe.covidcasesapp.vo;

public class CovidCasesInfoResponse {
	
	private String city;
	private long countCases;
		
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getCountCases() {
		return countCases;
	}
	public void setCountCases(long countCases) {
		this.countCases = countCases;
	}

	
}

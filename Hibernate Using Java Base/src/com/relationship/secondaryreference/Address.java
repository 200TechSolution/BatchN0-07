package com.relationship.secondaryreference;

public class Address {
	
	private String cityName;
	private String DisName;
	
	private long pinCode;
	private AreaName areaName;
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getDisName() {
		return DisName;
	}
	public void setDisName(String disName) {
		DisName = disName;
	}
	
	public AreaName getAreaName() {
		return areaName;
	}
	public void setAreaName(AreaName areaName) {
		this.areaName = areaName;
	}
	public long getPinCode() {
		return pinCode;
	}
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}

	
}

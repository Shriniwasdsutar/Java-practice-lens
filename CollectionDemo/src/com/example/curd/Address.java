package com.example.curd;

public class Address {
	
	private  String city;
	private int flatNo;
	private int laneNo;
	private String state;
	private String country;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String city, int flatNo, int laneNo, String state, String country) {
		super();
		this.city = city;
		this.flatNo = flatNo;
		this.laneNo = laneNo;
		this.state = state;
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}
	public int getLaneNo() {
		return laneNo;
	}
	public void setLaneNo(int laneNo) {
		this.laneNo = laneNo;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", flatNo=" + flatNo + ", laneNo=" + laneNo + ", state=" + state + ", country="
				+ country + "]";
	}
	
	

}

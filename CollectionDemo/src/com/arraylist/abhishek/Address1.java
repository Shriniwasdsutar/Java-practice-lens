package com.arraylist.abhishek;

public class Address1 {
private String flatno;
private String city;
private int pincode;
private String state;
private String country;







public Address1(String flatno, String city, int pincode, String state, String country) {
	super();
	this.flatno = flatno;
	this.city = city;
	this.pincode = pincode;
	this.state = state;
	this.country = country;
}
public String getFlatno() {
	return flatno;
}
public void setFlatno(String flatno) {
	this.flatno = flatno;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
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
	return "Address1 [flatno=" + flatno + ", city=" + city + ", pincode=" + pincode + ", state=" + state + ", country="
			+ country + "]";
}


}

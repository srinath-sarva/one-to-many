package com.sarva.springapp_using_xml;

public class Address {

	private int hno;
	private String city;
	
	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getCity() {
		return city;
	}

	public Address() {
		super();
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", city=" + city + "]";
	}
}

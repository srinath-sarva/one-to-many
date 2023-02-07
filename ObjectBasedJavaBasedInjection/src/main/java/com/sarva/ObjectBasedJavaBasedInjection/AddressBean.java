package com.sarva.ObjectBasedJavaBasedInjection;

public class AddressBean {
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
	public void setCity(String city) {
		this.city = city;
	}
	public AddressBean() {
		super();
	}
	@Override
	public String toString() {
		return "AddressBean [hno=" + hno + ", city=" + city + "]";
	}
	
	

}

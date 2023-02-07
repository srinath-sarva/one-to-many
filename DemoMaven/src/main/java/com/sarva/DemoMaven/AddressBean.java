package com.sarva.DemoMaven;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AddressBean {
	@Value("100")
	private int hno;
	@Value("hyd")
	private String city;
	@Value("ts")
	private String state;
	public AddressBean() {
		super();
	}
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	@Override
	public String toString() {
		return "AddressBean [hno=" + hno + ", city=" + city + ", state=" + state + "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public void  printAddressBean() {
		System.out.println("hno=" + hno + ", city=" + city + ", state=" + state + "");
		
	} 
	

}

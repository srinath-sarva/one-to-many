package com.sarva.Java_Configuration;

public class BeanClass {

	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BeanClass() {
		super();
		
	}
	public void bm()
	{
		System.out.println(this.id+" "+this.name);
		
	}
	
}

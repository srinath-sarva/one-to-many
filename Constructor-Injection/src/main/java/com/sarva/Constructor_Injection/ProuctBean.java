package com.sarva.Constructor_Injection;

public class ProuctBean {

	private int prodId;
	private String proName;
	private double price;
	private int quantity;
	public ProuctBean(int prodId, String proName, double price, int quantity) {
		super();
		this.prodId = prodId;
		this.proName = proName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void printProduct()
	{
		System.out.println(prodId);
		System.out.println(proName);
		System.out.println(price);
		
	}

	public ProuctBean() {
		super();
	}
}

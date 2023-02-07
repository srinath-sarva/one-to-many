package com.sarva.DiscountMaven;

public class Product {
	
	private int productId;
	private String productName;
	private int  quantity;
	public Product() {
		super();
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	private double price;
	
	public void printProduct()
	{ 
		System.out.println(this.productId+" "+this.productName+" "+this.price+" "+this.quantity);
		double discount=0;
		double total=0;
		total=price*quantity;
		if(total<=2000)
			discount=0.1*total;
		else if(total>=2000 && total<5000)
			discount=0.15*total;
		else
			discount=0.25*total;
		System.out.println("discount"+discount);
		System.out.println("total "+total);
		System.out.println("net "+(total-discount));
	}
	
}

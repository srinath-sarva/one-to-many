package com.sarva.DiscountMaven;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration {
	Scanner sc = new Scanner(System.in);

	@Bean("id1")
	public Product printProduct()
	{
		Product product= new Product();
		System.out.println("Enter the product details");
		int prodId=sc.nextInt();
		String productName=sc.next();
		int quantity=sc.nextInt();
		double price=sc.nextDouble();
		product.setProductId(prodId);
		product.setProductName(productName);
		product.setPrice(price);
		product.setQuantity(quantity);
		return product;
	}
	
	
	

}

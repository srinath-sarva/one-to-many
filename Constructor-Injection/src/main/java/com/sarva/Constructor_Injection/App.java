package com.sarva.Constructor_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spconfig.xml");
		ProuctBean pb = (ProuctBean) ctx.getBean("id1");
		pb.printProduct();

	}
}

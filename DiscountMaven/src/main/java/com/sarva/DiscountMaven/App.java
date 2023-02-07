package com.sarva.DiscountMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx= new AnnotationConfigApplicationContext(JavaConfiguration.class);
    	Product p= (Product)ctx.getBean("id1");
    	p.printProduct();
    }
}

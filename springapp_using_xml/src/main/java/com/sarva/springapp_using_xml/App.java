package com.sarva.springapp_using_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx= new ClassPathXmlApplicationContext("spconfig.xml");
    	Employee emp= (Employee) ctx.getBean("id1");
    	System.out.println(emp.toCapital());
    }
}

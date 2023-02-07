package com.sarva.ObjectBasedJavaBasedInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext ctx= new AnnotationConfigApplicationContext(Configurator.class);
    	EmployeeBean eb1= (EmployeeBean)ctx.getBean("id1");
    	eb1.printBean();
     }
}
                                

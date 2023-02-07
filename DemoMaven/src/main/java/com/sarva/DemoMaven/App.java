package com.sarva.DemoMaven;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan("com.sarva.DemoMaven")
public class App 
{
   public static void main( String[] args )
    {
    	Logger logger= Logger.getLogger(App.class);
        logger.info("Application started");
    	ApplicationContext ctx= new AnnotationConfigApplicationContext(App.class);
    	EmployeeBean eb= (EmployeeBean) ctx.getBean(EmployeeBean.class);
    	logger.info("bean created");
    	eb.printEmployeeBean();
    	
    	
    }
}

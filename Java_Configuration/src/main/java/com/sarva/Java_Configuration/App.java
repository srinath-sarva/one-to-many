package com.sarva.Java_Configuration;

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
    	
    	ApplicationContext ctx= new AnnotationConfigApplicationContext(JavaConfig.class);
    	BeanClass bc= (BeanClass) ctx.getBean("id1");
    	bc.bm();
    }
}


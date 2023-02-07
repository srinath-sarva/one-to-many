package com.sarva.Java_Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	
	@Bean("id1")
	public BeanClass printBean()
	{
		BeanClass bean= new BeanClass();
		bean.setId(1);
		bean.setName("sarva");
		return bean;
	}
	
	

}

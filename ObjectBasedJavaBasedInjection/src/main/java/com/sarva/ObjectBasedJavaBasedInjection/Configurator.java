package com.sarva.ObjectBasedJavaBasedInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configurator {
	
	@Bean("id1")
	public EmployeeBean printEmployee()
	{
		AddressBean ab1= new AddressBean();
		ab1.setHno(101);
		ab1.setCity("Hyderabad");
		EmployeeBean e1= new EmployeeBean();
		e1.setEmpId(2001);
		e1.setEmpName("satya");
		e1.setAddr(ab1);
		return e1;
	}

}

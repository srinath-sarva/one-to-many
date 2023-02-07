package com.sarva.DemoMaven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {

	
     @Value("100001")
	private int empId;
     @Value("sarva")
	private String empName;
	@Autowired
	private AddressBean addr;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public AddressBean getAddr() {
		return addr;
	}
	public void setAddr(AddressBean addr) {
		this.addr = addr;
	}
	public EmployeeBean() {
		super();
	}
	public void printEmployeeBean() {
		System.out.println("empId=" + empId + ", empName=" + empName + ", addr=" + addr + ""); 
        addr.printAddressBean();
	}
	
	
}

package com.sarva.springapp_using_xml;

public class Employee {
	private int empId;
	private String empName;
	private Address addr;
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
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	public String toCapital()
	{
		return empName.toUpperCase();
	}

}

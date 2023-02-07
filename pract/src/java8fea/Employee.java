package java8fea;

public class Employee {

	private int id;
	private String name;
	private double salary;
	private int deptNum;
	private String location;
	public Employee(int id, String name, double salary, int deptNum, String location) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.deptNum = deptNum;
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getDeptNum() {
		return deptNum;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", deptNum=" + deptNum + ", location="
				+ location + "]";
	}
	public void setDeptNum(int deptNum) {
		this.deptNum = deptNum;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}

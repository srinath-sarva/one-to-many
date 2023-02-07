package java8fea;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101, "kannababu", 30000, 20, "hyderabad"));
		list.add(new Employee(102, "srinivas", 35000, 10, "Chennai"));
		list.add(new Employee(103, "Yakub", 40000, 20, "bangalore"));
		list.add(new Employee(104, "naresh", 45000, 20, "hyderabad"));
		list.add(new Employee(106, "ranjith", 42000, 30, "pune"));
		list.add(new Employee(107, "viji", 50000, 10, "bangalore"));
		// print each employee details
		list.stream().forEach(t -> System.out.println(t));
		// find employee with id 101;
		List<Employee> theIdEmployees = list.stream().filter(t -> t.getId() == 101).collect(Collectors.toList());
		System.out.println(theIdEmployees);

		// find the all names of the employees
		List<String> empNames = list.stream().map(Employee::getName).collect(Collectors.toList());
		System.out.println(empNames);
		
		//find the employee who doesnt belong to the place hyderbad 
		List<String> notHyderabadee= list.stream().filter(t -> !t.getLocation().equals("hyderabad")).map(Employee::getName).collect(Collectors.toList());
		System.out.println(notHyderabadee);
		
		//find employee belong to hyderabad and salary >40000
		List<String> empHydSalG40000=list.stream().filter(t -> t.getLocation().equals("hyderabad")).filter(t -> t.getSalary()>40000).map(Employee:: getName).collect(Collectors.toList());
		System.out.println(empHydSalG40000);
		
		//display all employees in descending order of the employee ID
		list.sort(new Comparator<Employee>() {
		public int compare(Employee o1, Employee o2) {
			if(o1.getId()>o2.getId())
				return -1;
			else
				return 1;
		};
		});
		System.out.println(list);
		//display all employees in acsending order of the employee ID
		
		list.sort(Comparator.comparing(Employee::getSalary,Comparator.reverseOrder()));
		System.out.println(list);
		
		
		

	}

}

package com.arraylist.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> persons= new ArrayList<Person>();
		persons.add(new Person("sarva", 34));
		persons.add(new Person("rvi",55));
		persons.add(new Person("kavitha",22));
		
		List<Integer> lis= new ArrayList<>();
		lis.add(45);
		lis.add(36);
		lis.add(21);
		lis.add(10);
		lis.add(22);
		System.out.println("----- sort using Collections.sort()-------");
		Collections.sort(lis);
		System.out.println(lis);
		System.out.println("-------reverse sort using Collections.sort()");
		Collections.sort(lis,Collections.reverseOrder());
		System.out.println(lis);

		
		System.out.println("-------Sorting using ArrayList.sort()");
		lis.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
		System.out.println(lis);
		
		System.out.println("------Sorting the list of objects based on new Comparator ");
		persons.sort(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAge().compareTo(o2.getAge());
			}
		});
		persons.forEach(t -> System.out.println(t));
		
		System.out.println("--------------Sorting the list of objects based on Comparator");
		persons.sort(Comparator.comparing(Person:: getName ));
		System.out.println(persons);
	}

}

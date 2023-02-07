package com.arraylist.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemovingElements {

	public static void main(String[] args) {
		List<String> lis = new ArrayList<>();
		// adding elements to list
		lis.add("xebra");
		lis.add("cat");
		lis.add("dog");
		lis.add("lion");
		System.out.println(lis);
		// removing elementfrom list
		lis.remove(0);
		System.out.println(lis);
		lis.removeIf(new Predicate<String>() {

			@Override
			public boolean test(String s) {
				if (s.charAt(0) == 'c')
					return true;
				return false;
			}

		});
     System.out.println(lis);
	}

}

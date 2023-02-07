package com.arraylist.practice;

import java.util.ArrayList;
import java.util.List;

public class AddingElements {

	public static void main(String[] args) {

		List<String> lis= new ArrayList<>();
		//adding elements to list 
		lis.add("xebra");
		lis.add("cat");
		lis.add("dog");
		lis.add("lion");
		//adding elements at given index
		lis.add(2,"snake");
		System.out.println(lis);
		//addAll method 
		List<String>lis2= new ArrayList<>();
		lis2.add("cheeethah");
		lis2.add("monkey");
		lis.addAll(lis2);
		System.out.println(lis);
		//change the element at nth index
		lis.set(4, "lioness");
		System.out.println(lis);
	}

}


package com.arraylist.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratingList {

	public static void main(String[] args) {
		List<String> lis = new ArrayList<>();
		// adding elements to list
		lis.add("xebra");
		lis.add("cat");
		lis.add("dog");
		lis.add("lion");
		lis.add("lion");
		//iterating list using forEach
		lis.forEach( t -> System.out.println(t));
		//iterating using iterator()
		ListIterator<String> it= lis.listIterator();
		System.out.println("-----------using List Iterator hasnext-----------");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//using hasprevious
		System.out.println("-----------using List Iterator hasprevious-----------");
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
		//itertating using iterator and forEachRemaining
		System.out.println("------itertating using iterator and forEachRemaining-----------");
		it.forEachRemaining(t -> System.out.println(t));
		
		
		//iterator for removing element
		while(it.hasNext())
		{
			if(it.next().equals("xebra"))
				it.remove();
		}
		//iterating using forEach loop
		System.out.println("---------------using forEach--------------");
		for(String s: lis)
		{
			System.out.println(s);
		}
		//using for loop
		System.out.println("------------------using for loop-------------");
		for(int i=0;i<lis.size();i++) {
			System.out.println(lis.get(i));
		}
		
		//index of element
		System.out.println(lis.indexOf("xebra"));
		System.out.println(lis.contains("xebra"));
		
	}

}

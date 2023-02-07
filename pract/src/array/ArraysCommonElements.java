package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ArraysCommonElements {
	public static void main(String[] args) {
		String[] arr1= {"hyd","sec","mum","pune"};
		String[] arr2= {"mum","chen","sec","bang"};
		Set<String> set= new HashSet<String>();
		for(int i=0;i<arr1.length;i++)
		{
		      for(int j=0;j<arr2.length;j++)
		      {
		    	  if(arr1[i]==arr2[j])
		    	  {
		    		  set.add(arr1[i]);
		    	  }
		      }
		      
		}
		System.out.println(set);
	}

}

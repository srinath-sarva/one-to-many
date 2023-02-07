package pract;

import java.util.Arrays;

public class Anagarams {

	public static void main(String[] args) {
		String a="idle";
		String b="edli";
		char[] arr1=  a.toCharArray();
		char[] arr2= b.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		String x= new String(arr1);
		String y= new String(arr2);
		if(x.equals(y))
		{
			System.out.println("anagaram");
		}
		else
		{
			System.out.println("Not anagaram");
		}
	}
}

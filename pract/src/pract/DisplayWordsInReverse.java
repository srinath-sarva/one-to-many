package pract;

import java.util.Arrays;

public class DisplayWordsInReverse {
	public static void main(String[] args) {
		String s="Hi Hello How Are You";
		String s2="";
		String[] arr= s.split(" ");
        for(int i=arr.length-1;i>=0;i--)	
        {
        	s2+=arr[i]+" ";
        }
		System.out.println(s2);
	}

}

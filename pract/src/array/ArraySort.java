package array;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		
		int[] arr= {10,9,13,9,1,4,0};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>arr[i])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}

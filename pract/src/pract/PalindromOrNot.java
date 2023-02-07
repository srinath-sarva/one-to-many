package pract;

public class PalindromOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="abcba";
		int n= str.length();
		int count=0;
		for(int i=0;i<n/2;i++)
		{
			if(str.charAt(i)==str.charAt(n-i-1))
			{
				count++;
			}
		}
		if(count==n/2)
		{
			System.out.println("palindrom ");
		}
		else
		{
			System.out.println("Not Palindrom");
		}
		
	}

}

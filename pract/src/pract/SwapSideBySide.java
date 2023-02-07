package pract;

public class SwapSideBySide {

	public static void main(String[] args) {
		
		String s1="abcdefghijklmnop";
		String s2="";
		for(int i=0;i<s1.length()-2;i+=2)
		{
			s2+=s1.charAt(i+1);
			s2+=s1.charAt(i);
		}
		System.out.println(s2);
	}
}

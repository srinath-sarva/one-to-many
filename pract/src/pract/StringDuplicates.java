package pract;

public class StringDuplicates {

	public static void main(String[] args) {

		String s1="abhajbcgckla";
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			if(!s2.contains(""+s1.charAt(i)))
			{
				s2+=s1.charAt(i);
			}
		}
		System.out.println(s2);
		
		
	}

}

package pract;

public class CountWords {

	public static void main(String[] args) {
		
		String s="Hi Hello How Re You";
		int count=1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				count+=1;
			}
		}
		System.out.println(count);
	}
}

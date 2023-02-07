package pract;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String k="aabbcccccgffhhhadddggwweerrajaj";
		String s="";
		int i=0,j=0;
		for( i=0;i<k.length();i++)
		{
			for( j=0;j<=i;j++)
			{
				if(k.charAt(i)==k.charAt(j))
				{
					break;
				}
			}
			if(i==j)
			{
				s+=k.charAt(i);
			}
		}
		System.out.println(s);
		
	}

}

package pract;

public class StringEloberate {

	public static void main(String[] args) {
		String k="a2bc4d";
		String out="";
		int i=0;
		while(i<k.length()-1)
		{
			char ch1= k.charAt(i);
			char ch2= k.charAt(i+1);
			if(ch2>='0' && ch2<='9')
			{
				for(int j=0;j<(ch2-48);j++)
				{
					out+=ch1;
				}
				i+=2;
			}
			else
			{
				out+=ch1;
				i+=1;
			}
		}
		System.out.println(out);
	}
}

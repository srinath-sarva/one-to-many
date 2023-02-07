package pract;

public class SumOfDigits {

	public static void main(String[] args) {
		String str="ab1c4578ik9";
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
			  sum+=str.charAt(i)-48;
			}
		}
		System.out.println(sum);
	}
}

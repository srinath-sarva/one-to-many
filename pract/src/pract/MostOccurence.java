package pract;

public class MostOccurence {

	public static void main(String[] args) {
		int max=0;
		char ch = 0;
		String str="abcdefabcaaaaa";
		int[] arr= new int[256];
		for(int i=0;i<str.length();i++)
		{
			arr[str.charAt(i)]++;
			if(str.charAt(i)>max)
				max=str.charAt(i);
			    ch=str.charAt(i);
			
		}
		System.out.println(ch);
		
	}
}

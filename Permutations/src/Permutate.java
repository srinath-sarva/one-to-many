import java.util.HashSet;
import java.util.Set;

public class Permutate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ABCD";
		Set<String> set= new HashSet<String>();
		char[] arr= str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				
			       char temp=arr[i];
			       arr[i]= arr[j];
			       arr[j]= temp;
			       for(int k=0;k<str.length();k++)
					{
					       char temp2=arr[j];
					       arr[j]= arr[k];
					       arr[k]= temp2;
					       String str2= new String(arr);     
					       set.add(str2);

					}
			       

			}
			arr=str.toCharArray();	
		}
		 System.out.println(set.size());
	}

}

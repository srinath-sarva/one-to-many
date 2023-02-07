package array;

public class PalindromOrders {
	public static void main(String[] args) {
		String s="Madam Arora teaches Malayalam";
		String[] arr=s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			String k=arr[i].toLowerCase();
			int count=0;
		  for(int j=0;j<k.length()/2;j++)
		  {
			  if(k.charAt(j)==k.charAt(k.length()-1-j))
			  {
				  count+=1;
			  }
		  }
		  if(count==k.length()/2)
		  {
			  System.out.println(k);
		  }
		}
		
		
	}

}

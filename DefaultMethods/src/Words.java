
public interface Words {

	public default String numberToWords(int number) {
		String[] arr = new String[10];
		String[] numbers= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		int remainder;
		int i = 0;
		while (number != 0) {
			remainder = number % 10;
			arr[i]=numbers[remainder];
			number=number/10;
			i++;
			}
		String output="";
		for(int k=arr.length-1;k>=0;k--)
		{
			if(arr[k]!=null)
			output+=arr[k];
		}
		 return output;
	}

}

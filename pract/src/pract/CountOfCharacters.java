package pract;



public class CountOfCharacters {

	public static void main(String[] args) {
	 String s="abcyhdabjch";
	 int[] arr= new int[256];
	 for(int i=0;i<s.length();i++)
	 {
		 arr[(int)s.charAt(i)]++;
	 } 
	 for(int i=0;i<256;i++)
	 {
		 if(arr[i]!=0)
		 System.out.println((char) i +" "+arr[i]);
	 }
	}
	
	

}
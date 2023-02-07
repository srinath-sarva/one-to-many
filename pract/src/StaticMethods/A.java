package StaticMethods;

public interface A  {
	 public static int getIndex(String str,char ch)
	 {
		 for(int i=0;i<str.length();i++)
		 {
			 if(str.charAt(i)==ch)
			 {
				 return i;
			 }
		 }
		 return -1;
	 }
	

}

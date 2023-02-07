

public class ListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="ab12321bajkkjh3432";
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+1;j<s.length();j++) {
				String sub=s.substring(i,j);
				String rev="";
				System.out.println(sub);
				
			}
		}
	}

}

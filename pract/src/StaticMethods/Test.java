package StaticMethods;

public class Test implements StringClass {
	
	public static void main(String[] args) {
		
		
		String str=StringClass.reverseString("Hello");
		System.out.println(str);
	}

}

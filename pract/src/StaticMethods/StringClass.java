package StaticMethods;

public interface StringClass {
	
	public static String reverseString(String str) {
		String str2 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			str2 += str.charAt(i);
		}
		
		return str2;
		
	}
}

package array;

import java.util.ArrayList;
import java.util.List;

public class RegistrationIdss {
	public static void main(String[] args) {
		List<String> registrationIds= new ArrayList<String>();
		registrationIds.add("AP 05 CY3421");
		registrationIds.add("TS 02 DP3321");
		registrationIds.add("AP 07 AP7431");
		registrationIds.add("AP 05 BW2571");
		for(String s: registrationIds) 
		{
			if(s.substring(0, 2).equals("AP"))
			{
				System.out.println(s);
			}
		}
		
	}

}

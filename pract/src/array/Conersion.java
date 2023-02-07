package array;

public class Conersion {
	public static void main(String[] args) {
        int k=10;
        int i=0;
        int rem=0; 
        int[] binary= new int[40]; 
        while(k!=0)
        {
        	rem=k%2;
        	binary[i++]=rem;
        	k=k/2;
        	
        }
        for(int j=i-1;j>=0;j--)
        {
        	System.out.println(binary[j]);
        }
        
	}

}

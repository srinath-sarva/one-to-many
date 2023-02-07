import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BankManagement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
     Scanner sc= new Scanner(System.in);
     Connection conn= DbConnection.getConnection();
     try {
     while(true)
     {
    	 System.out.println("1.Create account");
    	 System.out.println("2.Login Account");
    	 System.out.println("Enter Input");
    	 int ch1=sc.nextInt();
    	 if(ch1==1)
    	 {
    		 System.out.println("Enter Details of bank");
    		 int accno=sc.nextInt();
    		 String cname=sc.next();
    		 double balance=sc.nextDouble();
    		 String username=sc.next();
    		 String passcode=sc.next();
    		 Bank bank= new Bank(accno, cname, balance, username, passcode);
    		
    		  PreparedStatement ps1=conn.prepareStatement("insert into jbank values (?,?,?,?,?)");
    		  ps1.setInt(1, bank.getAccno());
    		  ps1.setString(2, bank.getCname());
    		  ps1.setDouble(3, bank.getBalance());
    		  ps1.setString(4, bank.getUsername());
    		  ps1.setString(5, bank.getPasscode());
    		  ps1.executeUpdate(); 
    		  System.out.println("User created");
    	 }
    	 else if(ch1==2)
    	 {
    		System.out.println("Enter Username");
    		String uname=sc.next();
    		System.out.println("ENter passcode");
    		String passcode=sc.next(); 
    		PreparedStatement ps2=conn.prepareStatement("select * from jbank where username=? and passcode=?");
    		ps2.setString(1, uname);
    		ps2.setString(2, passcode);
    		ResultSet rs2=ps2.executeQuery();
    		if(rs2.next())
    		{
    			System.out.println("Hello "+rs2.getString(2));
    			System.out.println("1)Transfer amount");
    			System.out.println("2)View Balance");
    			System.out.println("3)Logout");
    			System.out.println("ENter choice");
    			int ch2=sc.nextInt();
    			if(ch2==1)
    			{
    				System.out.println("Enter reciever accno");
    				int taccno=sc.nextInt();
    				System.out.println("ENter Amount");
    				int accno=rs2.getInt(1);
    				double tamount=sc.nextDouble();
    				if(rs2.getDouble(3)>=tamount)
    				{
    					PreparedStatement ps3=conn.prepareStatement("update jbank set balance=balance+? where accno=?");
    					ps3.setInt(2, taccno);
    					ps3.setDouble(1, tamount);
    					int k=ps3.executeUpdate();
    					int l = 0;
    					if(k>0)
    					{
    						PreparedStatement ps4=conn.prepareStatement("update jbank set balance=balance-? where accno=?");
        					ps4.setInt(2, accno);
        					ps4.setDouble(1, tamount);
        				l=ps4.executeUpdate();
        					
    					}
    					if(l>0)
    						System.out.println("Transferred succesfully");
    					else
    					    System.out.println("Not transfeered");
    					
    				}
    				
    			}
    			else if(ch2==2)
    			{
    				System.out.println(rs2.getString(3));
    			}
    			else if(ch2==3)
    			{
    				System.out.println("logged out");
    				conn.close();
    			
    			}
    			
    		}
    	       
    	 }
     }
		
     }
     catch (Exception e) {
		// TODO: handle exception
	}
	}

}

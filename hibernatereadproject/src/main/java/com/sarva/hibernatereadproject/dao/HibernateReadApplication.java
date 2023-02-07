package com.sarva.hibernatereadproject.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sarva.hibernatereadproject.Entity.Account;
import com.sarva.hibernatereadproject.util.SessionProvider;


public class HibernateReadApplication {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
       Session session= SessionProvider.getSession();
       Transaction ts= session.beginTransaction();
       Account account=session.get(Account.class, 12);
       if(account!=null)
       {
    	   account.setBalance(account.getBalance()+5000);
    	   System.out.println("Updated succesfully");
       }
       else
       {
    	   System.out.println("Account doesnt exixts");
       }
	   ts.commit();
	}
}

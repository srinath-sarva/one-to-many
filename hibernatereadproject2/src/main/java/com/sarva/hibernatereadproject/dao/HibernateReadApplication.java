package com.sarva.hibernatereadproject.dao;

import org.hibernate.Session;

import com.sarva.hibernatereadproject.Entity.Account;
import com.sarva.hibernatereadproject.util.SessionProvider;

public class HibernateReadApplication {

	public static void main(String[] args) {
       Session session= SessionProvider.getSession();
       Account account= session.get(Account.class, 1001);
       if(account!=null)
       {
    	   System.out.println("a/c number "+account.getAccno());
    	   System.out.println("A/c Holder Name "+account.getName());
    	   System.out.println("A/c balance "+ account.getBalance());
    	   
       }
       else
       {
    	   System.out.println("Account Doesnt exist");
    	   
       }
       session.close();
	}
}

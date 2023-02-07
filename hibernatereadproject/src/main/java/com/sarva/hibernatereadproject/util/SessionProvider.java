package com.sarva.hibernatereadproject.util;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionProvider {

	private static SessionFactory sessionFactory;
	static {
		Configuration configuration= new Configuration();
		configuration.configure(new File("hibernate.cfg.xml"));
		sessionFactory=configuration.buildSessionFactory();
	}
	public static Session getSession() {
		return sessionFactory.openSession();
		
		
	}
	

}

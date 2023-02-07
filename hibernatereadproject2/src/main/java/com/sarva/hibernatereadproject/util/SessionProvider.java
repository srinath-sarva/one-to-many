package com.sarva.hibernatereadproject.util;

import java.io.File;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.sarva.hibernatereadproject.Entity.Account;

public class SessionProvider {

	private static SessionFactory sessionFactory;
	static {
		//Configuration configuration= new Configuration();
	//	configuration.configure(new File("hibernate.cfg.xml"));
		Properties properties= new Properties();
		properties.put(Environment.DRIVER,"oracle.jdbc.driver.OracleDriver" );
		properties.put(Environment.URL, "jdbc:oracle:thin:@localhost:1521:xe");
		properties.put(Environment.USER, "sarva");
		properties.put(Environment.PASS, "sarva");
		properties.put(Environment.DIALECT, "org.hibernate.dialect.Oracle12cDialect");


	Configuration configuration= new Configuration().setProperties(properties);
	configuration.addAnnotatedClass(Account.class);
	sessionFactory=configuration.buildSessionFactory();
	}
	public static Session getSession() {
		return sessionFactory.openSession();
	}
	

}

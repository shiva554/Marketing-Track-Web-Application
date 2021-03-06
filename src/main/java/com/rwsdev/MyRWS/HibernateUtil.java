package com.rwsdev.MyRWS;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	
	static{
		try{
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex){
			System.err.println("Initial creation failed"+ex);
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
		
	}
}

package com.tjetc.app.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static Configuration config;
	private static SessionFactory sessionFactory;
	static{
		config=new Configuration().configure();
		sessionFactory=config.buildSessionFactory();
	}
	public static Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	public static Session openSession(){
		return sessionFactory.openSession();
	}

}

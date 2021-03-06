package com.hexaware.hibernateassociationsusingannotations.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.hexaware.hibernateassociationsusingannotations.entity.Application;
import com.hexaware.hibernateassociationsusingannotations.entity.Course;
import com.hexaware.hibernateassociationsusingannotations.entity.Student;
import com.hexaware.hibernateassociationsusingannotations.entity.StudentProfile;


/*
 * Java Configuration file that contains
 * information about the database
 * instead of hibernate.cfg.xml file
 */
public class HibernateUtil {
	
	/* 
	 * Session Factory is used to create Session Object
	 * which is used to open the DB session through 
	 * Hibernate Framework
	 */
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory == null) {
			try {
				/*
				 * An instance/object of Configuration allows
				 * the application to specify db properties and mappings 
				 * used when creating a dbsession using SessionFactory
				 */
				Configuration cfg = new Configuration();
				/*
				 * This class contains key,value pair both are string
				 * it is subclass of Hashtable 
				 * can be used to represent persistent set of properties
				 */
				Properties dbsettings = new Properties();
				dbsettings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				dbsettings.put(Environment.URL, "jdbc:mysql://localhost:3306/hexawarepget2022");
				dbsettings.put(Environment.USER, "root");
				dbsettings.put(Environment.PASS, "root");
				dbsettings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
				dbsettings.put(Environment.SHOW_SQL, "true");
				dbsettings.put(Environment.HBM2DDL_AUTO, "create-drop");
				dbsettings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				cfg.setProperties(dbsettings);
				cfg.addAnnotatedClass(Student.class);
				cfg.addAnnotatedClass(Course.class);
				cfg.addAnnotatedClass(Application.class);
				cfg.addAnnotatedClass(StudentProfile.class);
				/*
				 * this contains contract that make up the hibernate
				 * native bootstrapping API to register the application
				 * with hibernate.
				 */
				ServiceRegistry  srvReg = new StandardServiceRegistryBuilder()
						.applySettings(cfg.getProperties()).build();
				System.out.println("Hibernate Java Config Service Registry Created");
				sessionFactory = cfg.buildSessionFactory(srvReg);
				return sessionFactory;
				
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				System.out.println("finally block");
			}
		}
		
		return sessionFactory;
		
	}

}

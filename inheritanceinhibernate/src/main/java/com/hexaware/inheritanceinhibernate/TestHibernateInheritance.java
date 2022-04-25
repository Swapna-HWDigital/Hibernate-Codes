package com.hexaware.inheritanceinhibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.hexaware.inheritanceinhibernate.entity.ContractEmployee;
import com.hexaware.inheritanceinhibernate.entity.Employee;
import com.hexaware.inheritanceinhibernate.entity.PermanentEmployee;
import com.hexaware.inheritanceinhibernate.util.HibernateUtil;

public class TestHibernateInheritance {
	
	public static void main(String[] args) {
		Transaction transaction = null;
		Session session = null;
		
		Employee emp = new Employee("Johny");
		PermanentEmployee pemp = new PermanentEmployee();
		pemp.setName("Joe");
		pemp.setSalary(50000);
		
		ContractEmployee cemp = new ContractEmployee();
		cemp.setName("Jotan");
		cemp.setHourlyCost(5000);
		
		try {
			//open session
			session = HibernateUtil.getSessionFactory().openSession();
			//start transaction
			transaction = session.beginTransaction();
			//insert(save) the student objects
			session.persist(emp);
			session.persist(pemp);
			session.persist(cemp);	
			//commit the transaction
			transaction.commit();
		}catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		
	}

}

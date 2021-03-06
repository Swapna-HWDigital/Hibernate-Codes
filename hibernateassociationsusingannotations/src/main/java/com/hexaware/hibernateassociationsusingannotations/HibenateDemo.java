package com.hexaware.hibernateassociationsusingannotations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hexaware.hibernateassociationsusingannotations.entity.Course;
import com.hexaware.hibernateassociationsusingannotations.entity.Student;
import com.hexaware.hibernateassociationsusingannotations.util.HibernateUtil;

public class HibenateDemo {

	public static void main(String[] args) {
		
		Student student1 = new Student("Krishna R","krisr@gmail.com");
		Course javaCourse = new Course("Java Basics",15000);
		Transaction transaction = null;
		Session session = null;
		
		try {
			//open session
			session = HibernateUtil.getSessionFactory().openSession();
			//start transaction
			transaction = session.beginTransaction();
			//insert(save) the student objects
			session.save(student1);
			session.save(javaCourse);
		
			
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
		
		
		//to display all the students and courses from the database
		try {
			//open session
			session = HibernateUtil.getSessionFactory().openSession();
			//start transaction
			transaction = session.beginTransaction();
			//select * from student;
			List<Student> studentList = session.createQuery("from Student",Student.class).list();
			
			for (int i=0;i<studentList.size();i++) {
				System.out.println("==========================================");
				System.out.println(studentList.get(i).getStudentId());
				System.out.println(studentList.get(i).getStudentName());
				System.out.println(studentList.get(i).getStudentEmail());
				System.out.println("==========================================");
			}
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

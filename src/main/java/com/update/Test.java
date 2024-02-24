package com.update;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		
		//update query for mavan hibernate
		Student student = (Student) session.get(Student.class, 1);
		student.setName("jyoti");
		session.update(student);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		System.out.println("Record update successfully");
		System.out.println("Update operation done")
	}

}

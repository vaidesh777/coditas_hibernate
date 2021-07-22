package com.luv2code.hibernate.demo;

import org.hibernate.SessionFactory;

import com.luv2code.hibernate.demo.entity.Student;

import org.cfg.Configuration;

public class CreateStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotated Class(Student.class)
				.buildSessionFactory()
				
				
				//create session
				
		Session session=Factory.getCurrentSession();
		
		try
		{
			System.out.println("creating new student object");
			
			
			Student tempStudent=new Student("vaibh","deshmukh","vaibh@gmail.com");
			
			session.beginTransaction();
			
			System.out.println("saving transaction");
			session.save(tempStudent);
			
			
			session.getTransaction().comit();
			System.out.println("done!");
			
		}

	}

}

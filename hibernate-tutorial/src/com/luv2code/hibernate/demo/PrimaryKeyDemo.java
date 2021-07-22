package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotated Class(Student.class)
				.buildSessionFactory()
				
				
				//create session
				
		Session session=Factory.getCurrentSession();
		
		try
		{
			System.out.println("creating new 3 student object");
			
			
			Student tempStudent1=new Student("vaibh","deshmukh","vaibh@gmail.com");
			Student tempStudent2=new Student("nik","deshmukh","nik@gmail.com");
			Student tempStudent3=new Student("john","deshmukh","johns@gmail.com");
			
			session.beginTransaction();
			
			System.out.println("saving transaction");
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			
			
			session.getTransaction().comit();
			System.out.println("done!");
			
	}

}

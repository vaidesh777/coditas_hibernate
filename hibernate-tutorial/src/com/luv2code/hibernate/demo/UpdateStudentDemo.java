package com.luv2code.hibernate.demo;

import org.hibernate.SessionFactory;

import com.luv2code.hibernate.demo.entity.Student;

import org.cfg.Configuration;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotated Class(Student.class)
				.buildSessionFactory();
				
				
				//create session
				
		Session session=Factory.getCurrentSession();
		
		try
		{   int studentId=1; 

			session.beginTransaction();
			
			System.out.println("saving student");
			System.out.println(tempStudent);
			session.save(tempStudent);
			
			
			session.getTransaction().comit();
			
			
			
			System.out.println("saved student:generated id:"+studentId);
			//now get a new session
			
			session= factory.getCurrentSession();
			
			session.beginTransaction();
			System.out.println("getting student witth id"+studentId);
			
			Student myStudent=Session.get(Student.class,studentId);
					
					
			System.out.println("updating student....");
			
			myStudent.setFirstName("scooby");
			
			
			session=factory.getCurrentSession();
			session.beginTransaction();
			
			//update email for all student
			System.out.println("update email for all students");
			session.createQuery("update student set email='foo@gmail.com'").executeUpdate();
			
			session.getTransaction.commit();
			
			
			
			
			System.out.println("done!");
			
			
		}
		finally
		{
			factory.close();
		}

	}

}







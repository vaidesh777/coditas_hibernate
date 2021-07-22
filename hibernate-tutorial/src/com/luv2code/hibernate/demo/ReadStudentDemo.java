package com.luv2code.hibernate.demo;

import org.hibernate.SessionFactory;

import com.luv2code.hibernate.demo.entity.Student;

import org.cfg.Configuration;

public class ReadStudentDemo {

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
			
			
			Student tempStudent=new Student("daffy","duck","daffy@gmail.com");
			
			session.beginTransaction();
			
			System.out.println("saving student");
			System.out.println(tempStudent);
			session.save(tempStudent);
			
			
			session.getTransaction().comit();
			
			
			
			System.out.println("saved student:generated id:"+tempStudent.getId());
			//now get a new session
			
			session= factory.getCurrentSession();
			
			session.beginTransaction();
			System.out.println("getting student witth id"+tempStudent.getId());
			
			Student myStudent=Session.get(Student.class,tempStudent.getId())
					
					
			System.out.println("get complete"+myStudent);
			
			session.getTransaction.commit();
			
			System.out.println("done!");
			
			
		}
		finally
		{
			factory.close();
		}

	}

}







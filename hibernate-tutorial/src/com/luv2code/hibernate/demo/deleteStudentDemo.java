package com.luv2code.hibernate.demo;

import org.hibernate.SessionFactory;

import com.luv2code.hibernate.demo.entity.Student;
import com.sun.tools.classfile.Attribute.Factory;

import org.cfg.Configuration;

public class deleteStudentDemo {

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
			
			session.getTransaction().commit();
			
			
			System.out.println("saved student:generated id:"+studentId);
			//now get a new session
			
			session= factory.getCurrentSession();
			
			session.beginTransaction();
			System.out.println("getting student witth id"+studentId);
			
			Student myStudent=Session.get(Student.class,studentId);
			
			//delete the student
			System.out.println("deleting student"+myStudent);
			
			
			//delete student id=2
			System.out.println("deleting student id=2");
			session.createQuery("delete from student where id=2").executeUpdate();
			
			
			session.getTransaction.commit();
			
			
			System.out.println("done!");
			
		}
		finally
		{
			factory.close();
		}

	}

}

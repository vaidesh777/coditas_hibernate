package com.luv2code.hibernate.demo;

import org.hibernate.SessionFactory;

import com.luv2code.hibernate.demo.entity.Student;

import org.cfg.Configuration;

public class QueryStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotated Class(Student.class)
				.buildSessionFactory()
				
				
				//create session
				
		Session session=Factory.getCurrentSession();
		
		try
		{
			
			session.beginTransaction();
			//query students
			List<Student> theStudents= session.createQuery("from Student").list();
			
			//display students
			
			for(Student tempStudent: theStudents)
			{
				System.out.println(tempStudent);
			}
			
			displayStudents(theStudents);
			//query student with lastname="doe"
			
			theStudents =session.createQuery("from Student s where s.lastName="doe").list();
				
					
					
			//display the students
			System.out.println("students who have last name of doe");
			displayStudents(theStudents);					
				
			//query students:lastName='doe' or firstName='daffy'
			
			theStudents=session.createQuery("from Student s where"+"s.lastName='doe" OR firstName='daffy').list();			
			
			System.out.println("\n\nstudents who have last name of doe and firstname daffy");
			
			//query students where email be like '%luv2code.com'
			
			thestudents=session.createQuery("from Student s where"+"s.email LIKE '%luv2code.com").list();
			System.out.println("\n\nstudents whos email ends  with luv2code.com");
			displayStudents(theStudents);
			
			
			session.getTransaction().comit();
			System.out.println("done!");
			
		}
finally
{
	factory.close();
}
	}

}

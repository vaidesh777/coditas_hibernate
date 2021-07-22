package com.luv2code.jdbc;

import java.sql.DriverManager;

import com.sun.jdi.connect.spi.Connection;

public class TestJdbc {

	public static void main(String[] args) {
		String jdbcUrl="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
        String user="hbstudent";
        String pass="hbstudent";
        
        try
        {
        	System.out.println("connecting to database"+jdbcUrl);
        	
        	Connection myconn=DriverManager.getConnection(jdbcUrl,user,pass);
        	
        	System.out.println("connection successful");
        	
        	}
        
        catch(Exception exc)
        {
        	exc.printStackTrace();
        }
        
        
	}

}

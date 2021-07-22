package com.luv2code.hibernate.demo.entity;

import javax.persistence.Generatedvalue;
import javax.persistence.GeneratedType;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {

	@Id
	@Generated(Strategy=generationType.Identity)
	@column(name = "Id")
	private int id;

	@column(name = "firstName")
	private String firstName;

	@column(name = "lastName")
	private int lastName;

	@column(name = "email")
	private String email;

	public Student() {

	}

	public Student(String firstName, int lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getLastName() {
		return lastName;
	}

	public void setLastName(int lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}

}

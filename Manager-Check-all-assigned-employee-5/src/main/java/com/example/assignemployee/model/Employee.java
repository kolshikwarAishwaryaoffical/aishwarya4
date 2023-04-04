package com.example.assignemployee.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name="employee")
public class Employee {

	@NotNull(message="employeeId should not be empty")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private String employeeId;

	@NotNull
	@NotEmpty(message=" FirstName should not be empty")
	@Size(min=2,message="First Name should have atleast 2 characters")
	@Column(name="first_name")
	private String firstName;
	
	@NotNull
	@Size(min=2,message="LastName should have atleast 2 characters")
	@Column(name="last_name")
	private String lastName;

	@NotEmpty(message=" Emailid should not be empty")
	@Email
	@Id
	//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="email_id")
	private String emailId;
	
	@Column(name="manageremail_id")
	private String memailId;
	
	
	


	
	public Employee() {
		
	}



	public Employee(@NotNull(message = "employeeId should not be empty") String employeeId,
			@NotNull @NotEmpty(message = " FirstName should not be empty") @Size(min = 2, message = "First Name should have atleast 2 characters") String firstName,
			@NotNull @Size(min = 2, message = "LastName should have atleast 2 characters") String lastName,
			@NotEmpty(message = " Emailid should not be empty") @Email String emailId, String memailId) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.memailId = memailId;
	}



	public String getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getEmailId() {
		return emailId;
	}



	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



	public String getMemailId() {
		return memailId;
	}



	public void setMemailId(String memailId) {
		this.memailId = memailId;
	}
	
	
	
	
//	String name[] = memailId.split("@");
//
//
//
//
//
//
//	public String[] getName() {
//		return name;
//	}



//	public Employee(String[] name) {
//		super();
//		this.name = name;
//	}



//	public void setName(String[] name) {
//		this.name = name;
//	}	
	
		
	
	
	
	
	

}
	

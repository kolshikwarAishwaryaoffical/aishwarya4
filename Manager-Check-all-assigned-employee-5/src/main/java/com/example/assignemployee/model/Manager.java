package com.example.assignemployee.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Manager {

	

	@NotNull
	@NotEmpty(message=" FirstName should not be empty")
	@Size(min=2,message="First Name should have atleast 2 characters")
	@Column(name="first_name")
	private String firstName;
//	@NotNull
//	@Size(min=2,message="LastName should have atleast 2 characters")
//	@Column(name="last_name")
//	private String lastName;
	@NotEmpty(message=" Emailid should not be empty")
	@Email
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="email_id")
	private String emailId;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Manager() {
		
	}
	public Manager(
			@NotNull @NotEmpty(message = " FirstName should not be empty") @Size(min = 2, message = "First Name should have atleast 2 characters") String firstName,
			@NotEmpty(message = " Emailid should not be empty") @Email String emailId) {
		super();
		this.firstName = firstName;
		this.emailId = emailId;
	}
	
	
	
	
	
}

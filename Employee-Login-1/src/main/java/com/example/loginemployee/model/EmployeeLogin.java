package com.example.loginemployee.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class EmployeeLogin {

	@NotEmpty
	@Email(message="Enter EmailId")
	private String email_id;
	
	@NotEmpty
    private String password;
    
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

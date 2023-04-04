package com.example.loginemployee.model;

import java.io.Serializable;

public class AuthenticationRequest implements Serializable{
	private String emailId;
    private String password;

   

	//need default constructor for JSON Parsing
    public AuthenticationRequest()
    {

    }



	public String getEmailId() {
		return emailId;
	}



	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public AuthenticationRequest(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}
	

    

}

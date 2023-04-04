package com.example.loginmanager.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.loginmanager.model.AuthenticationRequest;



public class AuthMapper  implements RowMapper<AuthenticationRequest>{
	@Override
	public AuthenticationRequest mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		AuthenticationRequest auth =new AuthenticationRequest();
		auth.setEmailId(rs.getString("email_id"));
		auth.setPassword(rs.getString("password"));
	
		return auth;
	}
}

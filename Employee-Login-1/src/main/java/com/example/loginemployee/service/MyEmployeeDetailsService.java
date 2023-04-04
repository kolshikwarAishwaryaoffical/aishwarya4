package com.example.loginemployee.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.loginemployee.repository.EmployeeRepository;

@Service
public class MyEmployeeDetailsService implements UserDetailsService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email_id) throws UsernameNotFoundException {
		UserDetails userDetails = employeeRepository.loadByusername(email_id);
		if(userDetails==null) {
			throw new UsernameNotFoundException("Employee not found");
		}
		return userDetails;
	}
}


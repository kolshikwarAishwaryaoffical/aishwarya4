package com.example.loginmanager.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.loginmanager.repository.ManagerRepository;

@Service
public class MyManagerDetailsService implements UserDetailsService{

	@Autowired
	private ManagerRepository managerRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email_id) throws UsernameNotFoundException {
		UserDetails userDetails = managerRepository.loadByusername(email_id);
		if(userDetails==null) {
			throw new UsernameNotFoundException("Manager not found");
		}
		return userDetails;
	}
}


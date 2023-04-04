package com.example.loginadmin.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyAdminDetailsService  implements UserDetailsService{

	 @Override
	    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
		 if(s.equals("Admin")) {
			 return new User("Admin", "Admin",
		                new ArrayList<>());
		 }
		 else {
			 throw new UsernameNotFoundException("admin not found");
		 }
	    }
}

package com.example.loginadmin.service;

import java.util.List;

import com.example.loginadmin.models.Employee;
import com.example.loginadmin.models.Manager;

public interface MangerService {
	 Manager saveManager(Manager manager);
	 List<Manager> getAllManagers();
	 Manager getManagerByEmailId(String email_id);
	 Manager updateManager(Manager m1,String email_id);
	 
}

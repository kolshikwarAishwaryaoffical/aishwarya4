package com.example.loginadmin.service;

import java.util.List;

import com.example.loginadmin.models.Employee;
import com.example.loginadmin.models.Manager;

public interface EmployeeService {
     Employee saveEmployee(Employee employee);
	 List<Employee> getAllEmployees();
	 Employee assignManager(Employee employee);
	
	
	
	 
}

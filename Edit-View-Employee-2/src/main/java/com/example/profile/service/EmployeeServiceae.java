package com.example.profile.service;

import com.example.profile.model.Employee;

public interface EmployeeServiceae {

	Employee getEmployeeByEmailId(String email_id);

	Employee updateEmployeeByemailid(Employee employee1, String email_id);
	
////Employee updateEmployeeByemailid(Employee employee,String email_id);
//	Employee updateEmployeeById(Employee employee, long id);

	//Employee updateEmployee(Employee employee, long id);
	
}
package com.example.assignemployee.service;

import java.util.List;

import com.example.assignemployee.model.Employee;

public interface AssignEmployeeService {
	 public List<Employee> getEmployeesByManager(String emailId);

}

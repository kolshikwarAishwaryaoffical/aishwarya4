package com.example.assignemployee.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assignemployee.model.Employee;
import com.example.assignemployee.repository.AssignEmployeeRepository;
import com.example.assignemployee.service.AssignEmployeeService;

@Service
public class AssignEmployeeServiceImpl implements AssignEmployeeService{
	
	@Autowired
	private AssignEmployeeRepository assignEmployeeRepository;

	public AssignEmployeeServiceImpl(AssignEmployeeRepository assignEmployeeRepository) {
		super();
		this.assignEmployeeRepository = assignEmployeeRepository;
	}

	@Override
	public List<Employee> getEmployeesByManager(String emailId) {
	
		return (List<Employee>) assignEmployeeRepository.getEmployeesByManager(emailId);
	}
	
	

}

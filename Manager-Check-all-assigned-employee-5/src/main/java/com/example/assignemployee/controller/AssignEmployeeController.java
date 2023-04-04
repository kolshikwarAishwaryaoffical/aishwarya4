package com.example.assignemployee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.assignemployee.model.Employee;
import com.example.assignemployee.service.AssignEmployeeService;


@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/assigned")
public class AssignEmployeeController {
	
	@Autowired
	private AssignEmployeeService assignEmployeeService;

	public AssignEmployeeController(AssignEmployeeService assignEmployeeService) {
		super();
		this.assignEmployeeService = assignEmployeeService;
	}
	
	@GetMapping("/{emailId}")
	public  List<Employee> getEmployeesByManager(@PathVariable("emailId")String emailId) {
		
		return assignEmployeeService.getEmployeesByManager(emailId);
		
	}
	

}

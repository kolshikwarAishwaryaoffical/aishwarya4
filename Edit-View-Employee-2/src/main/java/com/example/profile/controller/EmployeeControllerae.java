package com.example.profile.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.profile.model.Employee;
import com.example.profile.service.EmployeeServiceae;


//import com.example.profile.serviceimpl.EmployeeServiceaeImpl;

@RestController
@RequestMapping("/view")
@CrossOrigin("http://localhost:3000")
public class EmployeeControllerae {
	
	@Autowired
	private EmployeeServiceae employeeServiceae;
	
	
	
	public EmployeeControllerae(EmployeeServiceae employeeServiceae) {
		super();
		this.employeeServiceae = employeeServiceae;
	}
	@GetMapping("/{email_id}")
	public ResponseEntity<Employee>getEmployeeByEmailId(@PathVariable("email_id") String email_id){
		return new ResponseEntity<Employee>(employeeServiceae.getEmployeeByEmailId(email_id),HttpStatus.OK);
		
		
	}
	@PutMapping("/put/{email_id}")
	public ResponseEntity<Employee> updateEmployeeByemailid(@Valid @RequestBody Employee employee1,@PathVariable("email_id")String email_id) {
		return new ResponseEntity<Employee>(employeeServiceae.updateEmployeeByemailid(employee1,email_id),HttpStatus.OK);
	}
	
//	@PutMapping("/{id}")
//	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee1,@PathVariable("id")long  id) {
//		return new ResponseEntity<Employee>(employeeServiceae.updateEmployee(employee1,id),HttpStatus.OK);
//	}

	//by emailid put 1
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    // by emailid get2
//	@GetMapping("/{email_id}")
//	public ResponseEntity<Employee> getEmployeeByEmail(@PathVariable String email_id){
//		Employee employee=employeeServiceae.getEmployeeByEmailId(email_id);
//		if(employee!=null) {
//			return ResponseEntity.ok().body(employee);
//			
//		}
//		else {
//			return  ResponseEntity.notFound().build();
//		}
//	}
	
	

	

	

}

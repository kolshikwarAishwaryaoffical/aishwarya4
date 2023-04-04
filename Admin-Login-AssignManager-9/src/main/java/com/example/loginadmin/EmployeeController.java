package com.example.loginadmin;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.loginadmin.models.Employee;
import com.example.loginadmin.repository.EmployeeRepository;
import com.example.loginadmin.service.EmployeeService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/admin/employee")

public class EmployeeController {

	@Autowired
	private EmployeeService employeeService ;
	@Autowired
	private EmployeeRepository  employeeRespository;
	
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@PostMapping("/addemployee")
	public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee),HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getemployees")
	public List<Employee> getALLEmployee() {
		return employeeService.getAllEmployees();
		
	}
//	@PutMapping("/{employeeEmailId}/manager/{managerEmailId}")
//	public Employee assignManager(@PathVariable("employeeEmailId") String employeeEmailId,
//			@PathVariable("managerEmailId") String managerEmailId) {
//				return employeeService.assignManager(employeeEmailId,managerEmailId );
//		
//	}
	@PutMapping
	public ResponseEntity<Employee>  assignManager(@Valid @RequestBody Employee employee1) {
		return new ResponseEntity<Employee>(employeeService. assignManager(employee1),HttpStatus.OK);
	}
//	@PutMapping("/{managerEmailId}")
//	public Employee assignManager(@Valid @RequestBody Employee employee,String emailId){
//		return  employeeRespository.findByEmailId(emailId)
//				.map(employee -> {
//					employee.setFirstName(newEmployee.getFirstName());
//					employee.setLastName(newEmployee.getLastName());
//					employee.setEmailId(newEmployee.getEmailId());
//					return employeeRespository.save(employee);
//				}).orElseThrow(()->new EmployeeNotFoundException("not found"));
//		 
//	}
//	@PutMapping("/{managerEmailId}")
//	public ResponseEntity<Employee>assignManager(@Valid @RequestBody Employee employee,String emailId){
//		return new ResponseEntity<Employee>(employeeService.assignManager(employee,emailId),HttpStatus.CREATED);
//		
//	}
	
}
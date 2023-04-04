package com.example.loginadmin.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loginadmin.exception.ResourceNotFoundException;
import com.example.loginadmin.models.Employee;
import com.example.loginadmin.models.Manager;
import com.example.loginadmin.repository.EmployeeRepository;
import com.example.loginadmin.repository.ManagerRepository;
import com.example.loginadmin.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private ManagerRepository managerRepository;

	//	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
	//		super();
	//		this.employeeRepository = employeeRepository;
	//	}
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
		
	}

	@Override

	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub

		Employee employee11= employeeRepository.findByEmailId(employee.getEmailId());
		Employee id =employeeRepository.findByEmployeeId(employee.getEmployeeId());
		if(employee11 != null) {

			System.out.println("Employee already exist");
			throw new ResourceNotFoundException("Employee","emailId",employee.getEmailId()); 

		}
		else if(id != null) {
			System.out.println("Manager already exist");
			throw new ResourceNotFoundException("Employee","EmployeeId",employee.getEmployeeId()); 
		}

		return employeeRepository.save(employee);
	}

	



	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee assignManager(Employee employee1) {
		//Employee employee11=employeeRepository.findByEmailId(emailId);
//		 if(employee11 != null) {
			 employee1.setMemailId(employee1.getMemailId());
			
			 //employee11.setEmailId(employee1.getEmailId());
//		 }
//		 else {
//			 System.out.println("Employee Not exist");
//		 }
//		 
		 
			return employeeRepository.save(employee1);
	}

	


}

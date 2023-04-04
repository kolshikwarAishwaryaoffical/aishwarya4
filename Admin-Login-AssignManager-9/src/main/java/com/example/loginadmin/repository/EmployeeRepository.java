package com.example.loginadmin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loginadmin.models.Employee;
import com.example.loginadmin.models.Manager;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String>{
	
Employee findByEmailId(String emailId);
Employee findByEmployeeId(String employeeId);

}

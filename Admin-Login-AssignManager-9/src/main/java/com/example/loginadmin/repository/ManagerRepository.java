package com.example.loginadmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.loginadmin.models.Employee;
import com.example.loginadmin.models.Manager;

public interface ManagerRepository extends JpaRepository<Manager, String>{
	Manager findByEmailId(String emailId);
	Manager findByManagerId(String managerId);
}

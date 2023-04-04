package com.example.assigntask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.assigntask.modal.Employee;


@Repository
public interface EmployeeRepositoryinter  extends JpaRepository<Employee,String>{
	//@Query(value="select e.email_id from employee where e.email_id=?",nativeQuery=true)
     Employee findByEmailId(String email_id);
     Employee  findByMemailId(String memeail_id);
     
}

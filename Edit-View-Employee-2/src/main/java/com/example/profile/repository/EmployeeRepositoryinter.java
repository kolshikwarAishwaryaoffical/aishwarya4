package com.example.profile.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.profile.model.Employee;

@Repository
public interface EmployeeRepositoryinter  extends JpaRepository<Employee,String>{
	
	
@Query(value="select * from employee e, manager m where e.manageremail_id=m.email_id and e.email_id=?",nativeQuery=true)
     Employee findByEmailId(String email_id);
}

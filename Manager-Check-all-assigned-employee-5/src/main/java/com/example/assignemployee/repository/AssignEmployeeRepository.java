
package com.example.assignemployee.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.assignemployee.model.Employee;

@Repository
public interface AssignEmployeeRepository extends JpaRepository<Employee,String>{
	//@Query(value="select e.employee_id,e.first_name,e.last_name,e.email_id,e.mobile_number,m.first_name,m.email_id from employee e,manager m where e.manageremail_id=m.email_id and m.email_id=?",nativeQuery=true)
	@Query(value="select * from employee e, manager m where e.manageremail_id=m.email_id and m.email_id=?",nativeQuery=true)
    List<Employee> getEmployeesByManager(String emailId);
     //Employee findByEmailId(String email_id);
}
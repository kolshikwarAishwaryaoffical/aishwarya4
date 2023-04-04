package com.example.assigntask.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import com.example.assigntask.modal.Employee;
import com.example.assigntask.modal.TaskAssign;

public interface TaskRepository extends JpaRepository<TaskAssign, Long>{
		Employee findByEmailId(String email_id);
	    Employee findByMemailId(String memail_id);
	

}

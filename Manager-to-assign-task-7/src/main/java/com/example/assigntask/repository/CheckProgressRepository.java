package com.example.assigntask.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.assigntask.modal.OnlyProgress;

public interface CheckProgressRepository extends JpaRepository<OnlyProgress, String>{
	@Query(value="select * from ems.task where email_id=?",nativeQuery=true)
	List<OnlyProgress> findByEmailId(String email_id);
	@Query(value="select * from ems.task where task_id=?",nativeQuery=true)
	String findByTaskId(String taskId);
	
	
	

}

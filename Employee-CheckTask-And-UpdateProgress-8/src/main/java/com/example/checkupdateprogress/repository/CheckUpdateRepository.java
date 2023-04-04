package com.example.checkupdateprogress.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.checkupdateprogress.model.TaskAssign;

@Repository
public interface CheckUpdateRepository extends JpaRepository<TaskAssign,String>{
	//List<TaskAssign> findByEmailId(String email_id);
	//TaskAssign findByEmailId(String email_id);
	TaskAssign findByTaskId(String taskId);
	//List<TaskAssign> findEmailId(String email_id);
	@Query(value="select * from task where email_id=?",nativeQuery=true)
	List<TaskAssign> getAllTasks(String emailId);
}

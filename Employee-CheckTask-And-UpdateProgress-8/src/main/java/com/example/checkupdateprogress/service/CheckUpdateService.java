package com.example.checkupdateprogress.service;

import java.util.List;

import com.example.checkupdateprogress.model.TaskAssign;

public interface CheckUpdateService {
	
	//TaskAssign getByEmailId(String email_id);
	List<TaskAssign> getAllTasks(String emailId);
	
//	TaskAssign updateProgress(TaskAssign taskAssign,String email_id);
	TaskAssign updateProgress(TaskAssign taskAssign,String taskId);
	//List<TaskAssign> updateProgress(TaskAssign taskAssign,String email_id);
	TaskAssign getByTaskId(String taskId);
	
	
	
}

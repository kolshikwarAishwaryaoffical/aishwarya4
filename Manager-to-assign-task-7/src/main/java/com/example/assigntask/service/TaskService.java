package com.example.assigntask.service;



import com.example.assigntask.modal.TaskAssign;

public interface TaskService {
	
//	TaskAssign saveTask(TaskAssign taskAssign);
//	String setEmpemailToTask(String memail_id);
	TaskAssign saveTask(TaskAssign taskAssign,String emailId);
	

}

package com.example.assigntask.serviceimpl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assigntask.modal.Employee;
import com.example.assigntask.modal.TaskAssign;
import com.example.assigntask.repository.EmployeeRepositoryinter;
import com.example.assigntask.repository.TaskRepository;
import com.example.assigntask.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService{

	@Autowired
	private TaskRepository taskRepository;
	@Autowired
	private EmployeeRepositoryinter inter;

	public TaskServiceImpl(TaskRepository taskRepository) {
		super();
		this.taskRepository = taskRepository;
	}
    //without
	@Override
	public TaskAssign saveTask(TaskAssign taskAssign,String emailId) {
//		taskAssign.setTaskName(taskAssign.getEmailId());
//		String d=taskAssign.getMemailId();
//		Employee e=inter.findByEmailId(emailId);
//		boolean b=e.getMemailId().equals(d);
//		System.out.println(b);
//		if(e.getMemailId().equals(d)) {
//			System.out.println("yes");
//		} !(e.getMemailId().equals(d))||
		
		
		if(taskAssign.getDueDate().isBefore(LocalDate.now())) {
			throw new RuntimeException("Task can't assign ");
		}
		taskAssign.setTaskStatus("NotCompleted");
		return taskRepository.save(taskAssign);
	}
//    
//	@Override
//	public TaskAssign saveTask(TaskAssign taskAssign,String email_id) {
//
//		
//       Employee e11=inter.findByEmailId(email_id);
//      // Employee e12 = inter.findByMemailId(e11.getMemailId());
//       
//       if(email_id.equals(e11.getEmailId())) {
//    	   taskAssign.setEmailId(email_id);
//    	   taskAssign.setTaskStatus("NotCompleted");
//       }
//       else {
//    	   System.out.println("employee not added ");
//       }
//		
//		//taskAssign.setEmail_id(taskRepository.setEmpemailToTask(memail_id));
//		
//		return taskRepository.save(taskAssign);
//	}

	//	@Override
	//	public String setEmpemailToTask(String memail_id) {
	//		// TODO Auto-generated method stub
	//		return  taskRepository.setEmpemailToTask(memail_id);
	//	}





}

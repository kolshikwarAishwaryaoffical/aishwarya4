package com.example.checkupdateprogress.model;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Task")
public class TaskAssign {
    
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="taskId")
	private String taskId;

	
	@Column(name="taskName")
	private String taskName;


	@Column(name="description")
	private String description;


	@Column(name="dueDate")
	private LocalDate dueDate;

	
	@Column(name="taskSStatus")
	private String taskStatus;

	@Column(name="taskProgress")
	private String taskProgress;
	
	
	@Column(name="email_id")
	private String emailId;
	
	
	@Column(name="memail_id")
	private String memailId;

	

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMemailId() {
		return memailId;
	}

	public void setMemailId(String memailId) {
		this.memailId = memailId;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getTaskProgress() {
		return taskProgress;
	}

	public void setTaskProgress(String taskProgress) {
		this.taskProgress = taskProgress;
	}


	public TaskAssign() {
		
	}

	public TaskAssign(String taskId, String taskName, String description, LocalDate dueDate, String taskStatus,
			String taskProgress, String emailId, String memailId) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.description = description;
		this.dueDate = dueDate;
		this.taskStatus = taskStatus;
		this.taskProgress = taskProgress;
		this.emailId = emailId;
		this.memailId = memailId;
	}

	

	




}


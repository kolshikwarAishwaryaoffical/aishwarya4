package com.example.assigntask.modal;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Task")
public class TaskAssign {
    
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="taskId")
	private long taskId;

	@NotNull
	@NotEmpty(message=" Taskname should not be empty")
	@Column(name="taskName")
	private String taskName;

	@NotNull
	@NotEmpty(message="  description should not be empty")
	@Column(name="description")
	private String description;

	@NotNull
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

	public long getTaskId() {
		return taskId;
	}

	public void setTaskId(long taskId) {
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

	public TaskAssign() {
		
	}

	public TaskAssign(long taskId, @NotNull @NotEmpty(message = " Taskname should not be empty") String taskName,
			@NotNull @NotEmpty(message = "  description should not be empty") String description, LocalDate dueDate,
			@NotNull @NotEmpty(message = "  Taskstatus should not be empty") String taskStatus, String taskProgress,
			@Email @NotEmpty(message = " Employeeemailid should not be empty") String emailId,
			@Email @NotEmpty(message = " Manageremailid should not be empty") String memailId) {
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

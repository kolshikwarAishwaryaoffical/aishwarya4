package com.example.acceptorreject.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leave")
public class LeaveApply {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long leaveId;
	
	
	@Column
	private String emailId;
	
	@Column
	private String memailId;
	
	
	
	@Column
	private LocalDate fromDate;
	
	@Column
	private LocalDate toDate;
	
	@Column
	private String leaveReason;
	
	@Column
	private String leaveStatus;

	public long getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(long leaveId) {
		this.leaveId = leaveId;
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

	

	public LocalDate getFromDate() {
		return fromDate;
	}

	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	public LocalDate getToDate() {
		return toDate;
	}

	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	public String getLeaveReason() {
		return leaveReason;
	}

	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}

	public String getLeaveStatus() {
		return leaveStatus;
	}

	public void setLeaveStatus(String leaveStatus) {
		this.leaveStatus = leaveStatus;
	}

	public LeaveApply() {
		
	}

	public LeaveApply(long leaveId, String emailId, String memailId, LocalDate fromDate, LocalDate toDate,
			String leaveReason, String leaveStatus) {
		super();
		this.leaveId = leaveId;
		this.emailId = emailId;
		this.memailId = memailId;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.leaveReason = leaveReason;
		this.leaveStatus = leaveStatus;
	}
	
	
	

	
	

}

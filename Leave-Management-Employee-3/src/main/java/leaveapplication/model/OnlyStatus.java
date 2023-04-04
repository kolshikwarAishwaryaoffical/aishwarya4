package leaveapplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="leave")
public class OnlyStatus {

	
	@Id
	private long leaveId;
	@Column
	private String leaveStatus;
	
	@Column
	private String emailId;

	public String getLeaveStatus() {
		return leaveStatus;
	}

	public void setLeaveStatus(String leaveStatus) {
		this.leaveStatus = leaveStatus;
	}
	
	
	
//public String getEmailId() {
//		return emailId;
//	}
//
//	public void setEmailId(String emailId) {
//		this.emailId = emailId;
//	}

public OnlyStatus() {
		
	}

public OnlyStatus(String leaveStatus) {
	super();
	this.leaveStatus = leaveStatus;
	
}


	
	
	
}

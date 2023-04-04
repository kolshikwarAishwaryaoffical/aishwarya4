package leaveapplication.service;

import java.util.List;

import leaveapplication.model.LeaveApply;
import leaveapplication.model.OnlyStatus;

public interface LeaveService {
	LeaveApply saveLeave(LeaveApply  leaveApply );
	 List<LeaveApply> getEmpByEmailId(String email_id);
//	OnlyStatus getEmployeeByEmailId(String email_id);
	
}

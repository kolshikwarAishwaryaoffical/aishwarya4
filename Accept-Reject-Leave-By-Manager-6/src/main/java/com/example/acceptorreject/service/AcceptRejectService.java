package com.example.acceptorreject.service;



import java.util.List;

import com.example.acceptorreject.model.LeaveApply;

public interface AcceptRejectService {
	
  List<LeaveApply> getEmployeeByEmailId(String memail_id);
  
  //List<LeaveApply> getEmpByEmailId(String email_id);
  
  LeaveApply acceptLeave(LeaveApply leaveapply,String email_id);
  
  LeaveApply rejectLeave(LeaveApply leaveapply,String email_id);
  String deleteLeave(LeaveApply leaveapply,String emailId);

}

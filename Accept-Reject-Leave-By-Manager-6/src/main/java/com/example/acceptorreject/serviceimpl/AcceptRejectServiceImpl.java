package com.example.acceptorreject.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.acceptorreject.model.LeaveApply;
import com.example.acceptorreject.repository.AcceptRejectRepoistory;
import com.example.acceptorreject.service.AcceptRejectService;

@Service
@Transactional
public class AcceptRejectServiceImpl implements AcceptRejectService{
	
	@Autowired
	private AcceptRejectRepoistory acceptRejectRepoistory;
	
	

	public AcceptRejectServiceImpl(AcceptRejectRepoistory acceptRejectRepoistory) {
		super();
		this.acceptRejectRepoistory = acceptRejectRepoistory;
	}



	@Override
	public List<LeaveApply> getEmployeeByEmailId(String memail_id) {
		// TODO Auto-generated method stub
		return  acceptRejectRepoistory.findByMemailId(memail_id);
	}
    
	
//	@Override
//	public List<LeaveApply> getEmpByEmailId(String email_id) {
//		// TODO Auto-generated method stub
//		return  acceptRejectRepoistory.findByEmailId(email_id);
//	}



	



	@Override
	public LeaveApply acceptLeave(LeaveApply leaveapply, String email_id) {
		// TODO Auto-generated method stub
				LeaveApply la=acceptRejectRepoistory.findByEmailId(email_id);
				System.out.println(la.getLeaveStatus());
				String ss=la.getLeaveStatus();
				if(ss.equals("pending")||ss.equals("Rejected")) {
					la.setLeaveStatus("accepted");
				}
				else {
					System.out.println("pending");
				}
				return acceptRejectRepoistory.save(la);
	}



	@Override
	public LeaveApply rejectLeave(LeaveApply leaveapply, String email_id) {
		// TODO Auto-generated method stub
		LeaveApply la12=acceptRejectRepoistory.findByEmailId(email_id);
		if(la12!=null) {
			la12.setLeaveStatus("Rejected");
		}
		else {
			System.out.println("pending");
		}
		return acceptRejectRepoistory.save(la12);
	}



	@Override
	public String deleteLeave(LeaveApply leaveapply, String email_id) {
		LeaveApply la=acceptRejectRepoistory.findByEmailId(email_id);
		if(!la.getLeaveStatus().equalsIgnoreCase("Rejected")) {
			throw new RuntimeException("not found");
		}
		acceptRejectRepoistory.deleteByEmailId(email_id);
		return "deleted successfully";
		
		
	}



	






	
}

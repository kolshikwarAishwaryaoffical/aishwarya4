package leaveapplication.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import leaveapplication.model.OnlyStatus;
import leaveapplication.repository.StatusRepo;
import leaveapplication.service.StatusService;

@Service
public class StatusServiceImpl implements StatusService{
	
	@Autowired
	private StatusRepo statusRepo;
	

	public StatusServiceImpl(StatusRepo statusRepo) {
		super();
		this.statusRepo = statusRepo;
	}


	@Override
	public String getEmployeeByEmailId(String email_id) {
		return statusRepo.findByEmailIdstatus(email_id);
	}


//	@Override
//	public OnlyStatus getEmployeeByEmailId(String email_id) {
//		// TODO Auto-generated method stub
//		return statusRepo.findByEmailIdstatus(email_id);
//	}

}

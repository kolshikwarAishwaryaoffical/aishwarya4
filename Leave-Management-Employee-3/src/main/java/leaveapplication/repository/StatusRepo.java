package leaveapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import leaveapplication.model.OnlyStatus;


public interface StatusRepo extends JpaRepository<OnlyStatus, Long>{
	@Query(value="select * from ems.leave where email_id=?",nativeQuery=true)
//	LeaveApply saveEmployee(LeaveApply  leaveApply,String emailId );
	
	//OnlyStatus findByEmailIdstatus(String email_id);
	
	String findByEmailIdstatus(String email_id);
}

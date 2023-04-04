package leaveapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import leaveapplication.model.LeaveApply;
import leaveapplication.model.OnlyStatus;

@Repository
public interface LeaveRepository extends JpaRepository<LeaveApply, Long>{
//	@Query(value="select   leave_status from ems.leave where email_id=?",nativeQuery=true)
////	LeaveApply saveEmployee(LeaveApply  leaveApply,String emailId );
//	
//	OnlyStatus findByEmailIdstatus(String email_id);
	@Query(value="select * from ems.leave where email_id=?",nativeQuery=true)
	List<LeaveApply> findByEmailId(String email_id);
//	List<LeaveApply> findByMemailId(String memeail_id);
	
	
	
	
}

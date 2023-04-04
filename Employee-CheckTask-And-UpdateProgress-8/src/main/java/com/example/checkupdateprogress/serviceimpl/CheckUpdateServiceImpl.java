package com.example.checkupdateprogress.serviceimpl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.checkupdateprogress.model.TaskAssign;
import com.example.checkupdateprogress.repository.CheckUpdateRepository;
import com.example.checkupdateprogress.service.CheckUpdateService;


@Service
public class CheckUpdateServiceImpl implements CheckUpdateService{

	@Autowired
	private CheckUpdateRepository checkUpdateRepository;


	public CheckUpdateServiceImpl(CheckUpdateRepository checkUpdateRepository) {
		super();
		this.checkUpdateRepository = checkUpdateRepository;
	}


	


//	@Override
//	public TaskAssign updateProgress(TaskAssign taskAssign,String taskId) {
//		// TODO Auto-generated method stub
////		TaskAssign taskAssign2=checkUpdateRepository.findByEmailId(email_id);
//		TaskAssign taskAssign2=checkUpdateRepository.findTaskId(taskId);
//		if(taskAssign2!=null) {
//			if(LocalDate.now().isBefore(taskAssign2.getDueDate())) {
//				taskAssign2.setTaskProgress(taskAssign.getTaskProgress());
//			}
//			else {
//				taskAssign2.setTaskProgress("Task Already Passed Duedate can't update progress");
//			}
//		}
//		else {
//			System.out.println("No task Assigned");
//
//		}
//		return checkUpdateRepository.save(taskAssign2);	
//	}





//	@Override
//	public TaskAssign getByEmailId(String email_id) {
//		return checkUpdateRepository.findByEmailId(email_id);
//	}
	@Override
	public TaskAssign getByTaskId(String taskId) {
		// TODO Auto-generated method stub
		return checkUpdateRepository.findByTaskId(taskId);
	}




	@Override
	public List<TaskAssign> getAllTasks(String emailId) {
		// TODO Auto-generated method stub
		return (List<TaskAssign>)checkUpdateRepository.getAllTasks(emailId);
	}





	@Override
	public TaskAssign updateProgress(TaskAssign taskAssign, String taskId) {
		
			// TODO Auto-generated method stub
//			TaskAssign taskAssign2=checkUpdateRepository.findByEmailId(email_id);
			TaskAssign taskAssign2=checkUpdateRepository.findByTaskId(taskId);
//			boolean s1=taskAssign2.getTaskProgress().equalsIgnoreCase("completed");
//			boolean s2=taskAssign2.getTaskProgress().equalsIgnoreCase("done");
			if(taskAssign2!=null) {
				if(LocalDate.now().isBefore(taskAssign2.getDueDate())) {
				
				taskAssign2.setTaskProgress(taskAssign.getTaskProgress());
				if((taskAssign.getTaskProgress().equalsIgnoreCase("completed"))||
						(taskAssign.getTaskProgress().equalsIgnoreCase("done"))) {
					taskAssign2.setTaskStatus("Completed Task");
				}
				
					
				}
				else {
					taskAssign2.setTaskProgress("passed duedate");
				}
			}
			else {
				System.out.println("No task Assigned");

			}
			return checkUpdateRepository.save(taskAssign2);	
		}





	




	
	

}

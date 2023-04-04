package com.example.assigntask.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assigntask.modal.OnlyProgress;
import com.example.assigntask.repository.CheckProgressRepository;
import com.example.assigntask.service.CheckProgressService;

@Service

public class CheckProgressServiceImpl implements CheckProgressService{
	
	@Autowired
	private CheckProgressRepository checkProgressRepository;
	

	public CheckProgressServiceImpl(CheckProgressRepository checkProgressRepository) {
		super();
		this.checkProgressRepository = checkProgressRepository;
	}


	@Override
	public List<OnlyProgress> getByEmailIdProgress(String email_id) {
		// TODO Auto-generated method stub
		return checkProgressRepository.findByEmailId(email_id);

	}


	

	


	

	
	
	
	

}

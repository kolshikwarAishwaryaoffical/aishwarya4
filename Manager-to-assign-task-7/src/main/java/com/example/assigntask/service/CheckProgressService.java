package com.example.assigntask.service;

import java.util.List;

import com.example.assigntask.modal.OnlyProgress;

public interface CheckProgressService {

	public List<OnlyProgress> getByEmailIdProgress(String email_id);
	
	
}

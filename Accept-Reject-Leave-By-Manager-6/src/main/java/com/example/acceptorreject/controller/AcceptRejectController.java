package com.example.acceptorreject.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.acceptorreject.model.LeaveApply;
import com.example.acceptorreject.service.AcceptRejectService;



@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/updatestatus")

public class AcceptRejectController {
	
	@Autowired
	private AcceptRejectService acceptRejectService;

	public AcceptRejectController(AcceptRejectService acceptRejectService) {
		super();
		this.acceptRejectService = acceptRejectService;
	}
	
	@GetMapping("/{memail_id}")
	public List<LeaveApply> getEmployeeByEmailId(@PathVariable("memail_id") String memail_id){
		return acceptRejectService.getEmployeeByEmailId(memail_id);
		
	}
	
	@PutMapping("/accept/{email_id}")
	public ResponseEntity<LeaveApply> acceptLeave( LeaveApply leaveapply,@PathVariable("email_id") String email_id){
		return new ResponseEntity<LeaveApply>(acceptRejectService.acceptLeave(leaveapply, email_id),HttpStatus.OK);
	}
	
	@PutMapping("/reject/{email_id}")
	public ResponseEntity<LeaveApply> rejectLeave( LeaveApply leaveapply,@PathVariable("email_id") String email_id){
		return new ResponseEntity<LeaveApply>(acceptRejectService.rejectLeave(leaveapply, email_id),HttpStatus.OK);
	}
	
	@DeleteMapping("/del/{emailId}")
	public String deleteLeave(LeaveApply l,@PathVariable("emailId")String emailId) {
		return acceptRejectService.deleteLeave(l, emailId);
	}
    
}

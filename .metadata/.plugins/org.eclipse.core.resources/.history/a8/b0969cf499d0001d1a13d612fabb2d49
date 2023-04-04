package com.example.assigntask.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.assigntask.modal.OnlyProgress;
import com.example.assigntask.modal.TaskAssign;
import com.example.assigntask.service.CheckProgressService;
import com.example.assigntask.service.TaskService;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
@RequestMapping("/task")
@CrossOrigin("http://localhost:3000")
public class TaskController {

	@Autowired
	private TaskService taskService;
	
	@Autowired
	private CheckProgressService checkProgressService;

	public TaskController(TaskService taskService) {
		super();
		this.taskService = taskService;
	}
	//with pathvariable
		@PostMapping("/{email_id}")
		public ResponseEntity<TaskAssign> saveTask(@RequestBody TaskAssign taskAssign,@PathVariable("email_id")String email_id ){
			return new ResponseEntity<TaskAssign>(taskService.saveTask(taskAssign,email_id),HttpStatus.CREATED);
			
		}
	//without pathvariable
//	@PostMapping
//	public ResponseEntity<TaskAssign> saveTask(@Valid @RequestBody TaskAssign taskAssign){
//		return new ResponseEntity<TaskAssign>(taskService.saveTask(taskAssign),HttpStatus.CREATED);
//
//	}
	
		@GetMapping("/{email_id}")
		public List<OnlyProgress> getByEmailIdProgress(@PathVariable("email_id")String email_id ){
			return checkProgressService.getByEmailIdProgress(email_id);
		}
//	@GetMapping("/{taskId}")
//	public String getByEmailIdProgress(@PathVariable("taskId") String taskId) {
//		String obj= new String(checkProgressService.getByEmailIdProgress(taskId));
//		ObjectMapper om=new ObjectMapper();
//		String progress=null;
//		String op=null;
//		try {
//			progress=om.writeValueAsString(obj);
//			String[] s1=progress.split(",");
//			System.out.println(s1[6]);
//		     op=s1[6];
//			
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//		return op;
//		
//		
//	}
//	
	

}

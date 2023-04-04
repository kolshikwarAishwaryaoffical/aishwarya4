package com.example.loginadmin;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.loginadmin.models.Employee;
import com.example.loginadmin.models.Manager;
import com.example.loginadmin.service.MangerService;





@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/admin/manager")

public class ManagerController {
	
	@Autowired
	private MangerService managerService;

	public ManagerController(MangerService managerService) {
		super();
		this.managerService = managerService;
	}
	
	@PostMapping("/addmanager")
	public ResponseEntity<Manager> saveManager(@Valid @RequestBody Manager manager){
		return new ResponseEntity<Manager>(managerService.saveManager(manager),HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getmanagers")
	public List<Manager> getAllManagers() {
		return managerService.getAllManagers();
		
	}
	
	@GetMapping("/{email_id}")
	public ResponseEntity<Manager> getManagerByEmailId(@PathVariable("email_id") String email_id){
		return new ResponseEntity<Manager>(managerService.getManagerByEmailId(email_id),HttpStatus.OK);
		
	}
	
	@PutMapping("/put/{email_id}")
	public ResponseEntity<Manager> updateManager(@Valid @RequestBody Manager employee1,@PathVariable("email_id")String email_id) {
		return new ResponseEntity<Manager>(managerService.updateManager(employee1,email_id),HttpStatus.OK);
	}
	
}


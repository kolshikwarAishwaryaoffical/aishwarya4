package com.example.loginadmin.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loginadmin.exception.ResourceNotFoundException;
import com.example.loginadmin.models.Employee;
import com.example.loginadmin.models.Manager;
import com.example.loginadmin.repository.ManagerRepository;
import com.example.loginadmin.service.MangerService;

@Service
public class ManagerServiceImpl implements MangerService{


	@Autowired
	private ManagerRepository managerRepository;


	public ManagerServiceImpl(ManagerRepository managerRepository) {
		super();
		this.managerRepository = managerRepository;
	}

	@Override
	public Manager saveManager(Manager manager) {
		// TODO Auto-generated method stub
		Manager manager11=managerRepository.findByEmailId(manager.getEmailId());
		managerRepository.findByManagerId(manager.getManagerId());
		
		//managerRepository.find
		Manager id = managerRepository.findByManagerId(manager.getManagerId());
		
		if(id != null) {
			System.out.println("Manager already exist");
			throw new ResourceNotFoundException("Manager","ManagerId",manager.getManagerId()); 

		}
		if(manager11!=null) {
			System.out.println("Manager already exist");
			throw new ResourceNotFoundException("Manager ","emailId",manager.getEmailId());
		}

		return managerRepository.save(manager);
	}

	@Override
	public List<Manager> getAllManagers() {
		// TODO Auto-generated method stub
		return managerRepository.findAll();
	}

	@Override
	public Manager getManagerByEmailId(String email_id) {
		// TODO Auto-generated method stub
		return managerRepository.findByEmailId(email_id);
	}

	@Override
	public Manager updateManager(Manager employee1, String email_id) {
		// TODO Auto-generated method stub
		Manager employee11=managerRepository.findByEmailId(email_id);
		if(employee11!=null) {
			 employee11.setFirstName(employee1.getFirstName());
			 employee11.setLastName(employee1.getLastName());
			 employee11.setPassword(employee1.getPassword());
			 employee11.setAddress(employee1.getAddress());
			 employee11.setCity(employee1.getCity());
			 employee11.setCountry(employee1.getCountry());
			 employee11.setState(employee1.getState());
			 employee11.setDateOfBirth(employee1.getDateOfBirth());
			 employee11.setGender(employee1.getGender());
			 //employee11.setEmployeeId(employee1.getEmployeeId());
			 employee11.setMobileNumber(employee1.getMobileNumber());
			 employee11.setPinCode(employee1.getPinCode());
			 //employee11.setEmailId(employee1.getEmailId());
		}
		 else {
			 System.out.println("Employee Not exist");
		 }
		return managerRepository.save(employee11);
	}

}

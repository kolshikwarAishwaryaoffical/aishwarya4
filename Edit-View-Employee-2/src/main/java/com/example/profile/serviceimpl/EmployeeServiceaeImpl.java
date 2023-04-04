package com.example.profile.serviceimpl;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.profile.model.Employee;
import com.example.profile.repository.EmployeeRepositoryinter;
import com.example.profile.service.EmployeeServiceae;

@Service
public class EmployeeServiceaeImpl implements EmployeeServiceae{
	
	@Autowired
	private EmployeeRepositoryinter employeeRepositoryinter;
	
	
	
	public EmployeeServiceaeImpl(EmployeeRepositoryinter employeeRepositoryinter) {
		super();
		this.employeeRepositoryinter = employeeRepositoryinter;
	}



	@Override
	public Employee getEmployeeByEmailId(String email_id)  {
		// TODO Auto-generated method stub
		
		
			return employeeRepositoryinter.findByEmailId(email_id);
			
		}



//	@Override
//	public Employee updateEmployee(Employee employee, long id) {
//		// TODO Auto-generated method stub
//		Employee existingemployee=employeeRepositoryinter.findById(id).orElseThrow(()->
//		new ResourceNotFoundException("employee", "Id", id));
//		 existingemployee.setFirstName(employee.getFirstName());
//		 existingemployee.setLastName(employee.getLastName());
//		 existingemployee.setEmailId(employee.getEmailId());
//		 
//		 return employeeRepositoryinter.save(existingemployee);
//		 
//	}
//


	@Override
	public Employee updateEmployeeByemailid(Employee employee1, String email_id) {
		
		
	  Employee employee11=employeeRepositoryinter.findByEmailId(email_id);
		 if(employee11 != null) {
			 employee11.setFirstName(employee1.getFirstName());
			 employee11.setLastName(employee1.getLastName());
			 employee11.setPassword(employee1.getPassword());
			 employee11.setAddress(employee1.getAddress());
			 employee11.setMobileNumber(employee1.getMobileNumber());
			 employee11.setCity(employee1.getCity());
			 employee11.setCountry(employee1.getCountry());
			 employee11.setState(employee1.getState());
			 employee11.setDateOfBirth(employee1.getDateOfBirth());
			 employee11.setGender(employee1.getGender());
			 //employee11.setEmployeeId(employee1.getEmployeeId());
			
			 employee11.setPinCode(employee1.getPinCode());
			 //employee11.setEmailId(employee1.getEmailId());
		 }
		 else {
			 System.out.println("Employee Not exist");
		 }
		 
		 
			return employeeRepositoryinter.save(employee11);
	}



	

	

	
	}



	
	



package com.example.assigntask.modal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
@Table(name="employee")
public class Employee {

	@NotNull(message="employeeId should not be empty")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "employee_id")
	private String employeeId;

	@NotNull
	@NotEmpty(message=" FirstName should not be empty")
	@Size(min=2,message="First Name should have atleast 2 characters")
	@Column(name="first_name")
	private String firstName;
	@NotNull
	@Size(min=2,message="LastName should have atleast 2 characters")
	@Column(name="last_name")
	private String lastName;

	@NotEmpty(message=" Emailid should not be empty")
	@Email
	@Id
	//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="email_id")
	private String emailId;

	@NotEmpty(message=" password should not be empty")
	@NotNull
	@Size(min=6,message="Password should have atleast 6 characters")
	@Column(name="password")
	private String password;

	@NotEmpty
	@NotNull
	@Size(min=7,message="Role should have atleast 7 characters")
	@Column(name="role")
	private String role;

	@Column(name="mobile_number")
	private Long mobileNumber;

	@Column(name="gender")
	private String gender;

	@NotNull
	@Column(name="dob")
	private Date dateOfBirth;

	@Column(name="address")
	private String address;

	@Column(name="city")
	private String city;

	@Column(name="state")
	private String state;

	@Column(name="pincode")
	private Long pinCode;

	@Column(name="country")
	private String country;

	@Column(name="manageremail_id")
	private String memailId;
	public Employee() {

	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getPinCode() {
		return pinCode;
	}
	public void setPinCode(Long pinCode) {
		this.pinCode = pinCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getMemailId() {
		return memailId;
	}
	public void setMemailId(String memailId) {
		this.memailId = memailId;
	}
	public Employee(@NotNull(message = "employeeId should not be empty") String employeeId,
			@NotNull @NotEmpty(message = " FirstName should not be empty") @Size(min = 2, message = "First Name should have atleast 2 characters") String firstName,
			@NotNull @Size(min = 2, message = "LastName should have atleast 2 characters") String lastName,
			@NotEmpty(message = " Emailid should not be empty") @Email String emailId,
			@NotEmpty(message = " password should not be empty") @NotNull @Size(min = 6, message = "Password should have atleast 6 characters") String password,
			@NotEmpty @NotNull @Size(min = 7, message = "Role should have atleast 7 characters") String role,
			Long mobileNumber, String gender, Date dateOfBirth, String address, String city, String state, Long pinCode,
			String country, String memailId) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.password = password;
		this.role = role;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.country = country;
		this.memailId = memailId;
	}

	

	







}

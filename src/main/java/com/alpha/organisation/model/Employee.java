package com.alpha.organisation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NonNull
	@Size(min = 2,message = "le prenom doit avoir deux carateres")
	@Column(name = "firt_name")
	private String firstName;
	@NonNull
	@Size(min = 2,message = "le prenom doit avoir deux carateres")
	@Column(name = "last_name")
	private String lastName;
	
	@NotBlank
	@Email
	@Column(name = "email_addresse")
	private String emailId;
	@NonNull
	@Size(min = 5,message = "password doit avoir au moyen 5 caracteres")
	@Column(name = "passport_number")
	private String passportNumber;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(long id, @Size(min = 2, message = "le prenom doit avoir deux carateres") String firstName,
			@Size(min = 2, message = "le prenom doit avoir deux carateres") String lastName,
			@NotBlank @Email String emailId,
			@Size(min = 5, message = "password doit avoir au moyen 5 caracteres") String passportNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.passportNumber = passportNumber;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	
	

}

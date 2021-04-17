package com.alpha.organisation.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpha.organisation.model.Employee;
import com.alpha.organisation.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl  {
	@Autowired
	private EmployeeRepository employeeRepository;

	public void createEmployee( Employee emp) {
		employeeRepository.save(emp);
	}

	
}

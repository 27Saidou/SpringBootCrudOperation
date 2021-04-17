package com.alpha.organisation.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.organisation.model.Employee;
import com.alpha.organisation.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	
   @PostMapping("/employees")
	public Employee createEmployee(@Valid @RequestBody Employee emp) {
	   employeeServiceImpl.createEmployee(emp);
		return null;
	}
   @GetMapping("/employees")
   public List<Employee>getAllEmployees(){
	   return null;
   }
   @PutMapping("/employees/{id}")
   public void updateEmployees(@PathVariable(value = "id")Long employeeId) {
	   
   }
    @DeleteMapping("/employees/{id}")
    public void deleteEmployees(@PathVariable(value = "id") Long employeeId) {
    	
    }
}

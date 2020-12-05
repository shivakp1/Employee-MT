package com.employee.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.service.EmployeeRegistration;

@RestController
@CrossOrigin
public class EmplooyeeController {
	
	@Autowired
	public EmployeeRegistration employeeService;
	
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public Employee saveEmployee( @Valid @RequestBody Employee emp) {
		return employeeService.register(emp);
			
	}
	
	@RequestMapping(value = "all", method = RequestMethod.GET)
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
		
	}

}

package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;



public interface EmployeeRegistration {

	public Employee register(Employee employee);
	public List<Employee> getAllEmployees();
}

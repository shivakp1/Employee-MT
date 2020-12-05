package com.employee.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.employee.entity.Employee;




@Service
@Transactional
public class EmployeeRegistrationImpl implements EmployeeRegistration{

	@PersistenceContext
	public EntityManager entityManager;

	@Override
	public Employee register(Employee employee) {
		return entityManager.merge(employee);
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		return entityManager.createQuery("from Employee", Employee.class).getResultList().
				stream().sorted((emp1, emp2) -> emp1.getFirstName().compareTo(emp2.getFirstName()) ).
				collect(Collectors.toList());
	}
	

}

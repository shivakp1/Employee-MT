package com.employee.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.employee.contracts.LoginRequest;
import com.employee.entity.User;

@Service
@Transactional
public class LoginServiceImpl implements LoginService{

	@PersistenceContext
	public EntityManager entityManager;
	
	@Override
	public boolean authenticateUser(User loginRequest) {
		User user =entityManager.find(User.class, loginRequest.getUserName());
		System.out.println(user);
		System.out.println((user !=null) ? user.getPassword().equals(loginRequest.getPassword()) : false);
		return (user !=null) ? user.getPassword().equals(loginRequest.getPassword()) : false;
	
}
}

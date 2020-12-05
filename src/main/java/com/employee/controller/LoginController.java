package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.User;
import com.employee.exception.UserNotFoundException;
import com.employee.service.LoginService;

@RestController
@CrossOrigin
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public void login(@RequestBody User request) throws Exception {
		if(!loginService.authenticateUser(request)) {
			throw new UserNotFoundException("User not found");
		} 		
	}

}

package com.employee.service;

import com.employee.contracts.LoginRequest;
import com.employee.entity.User;

public interface LoginService {

	public boolean authenticateUser(User loginRequest);
}

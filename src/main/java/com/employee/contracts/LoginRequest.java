package com.employee.contracts;

public class LoginRequest {
public String userName;
public String password;

public String getUserName() {
	return userName;
}

public LoginRequest() {
	super();
}

public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	return "LoginRequest [userName=" + userName + ", password=" + password + "]";
}

}

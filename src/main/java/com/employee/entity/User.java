package com.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@Column(name = "username")
	public String userName;
	@Column(name = "password")
	public String password;
	public String getUserName() {
		return userName;
	}
	
	public User() {}
	
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
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
		return "User [userName=" + userName + ", password=" + password + "]";
	}
	
}

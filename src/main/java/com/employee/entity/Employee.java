package com.employee.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public int id;

public Employee() {
}

@NotBlank(message = "FirstName cannot be blank")
@NotEmpty(message = "FirstName cannot be empty")
@Column(name = "FIRST_NAME")
public String firstName;

@NotBlank(message = "LastName cannot be blank")
@NotEmpty(message = "LastName cannot be empty")
@Column(name = "LAST_NAME")
public String lastName;

@DateTimeFormat(pattern="yyyy/mm/dd")
@Column(name = "DOB")
public LocalDate dob;

@Column(name = "GENDER")
@NotBlank(message = "gender cannot be blank")
@NotEmpty(message = "gender cannot be empty")
public String gender;

@Column(name = "DEPARTMENT")
@NotBlank(message = "department cannot be blank")
@NotEmpty(message = "department cannot be empty")
public String department;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}



}

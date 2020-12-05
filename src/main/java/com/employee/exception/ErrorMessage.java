package com.employee.exception;

public class ErrorMessage {
public String error;
public String timeStamp;


public ErrorMessage(String error, String timeStamp) {
	super();
	this.error = error;
	this.timeStamp = timeStamp;
}

public String getError() {
	return error;
}
public void setError(String error) {
	this.error = error;
}
public String getTimeStamp() {
	return timeStamp;
}
public void setTimeStamp(String timeStamp) {
	this.timeStamp = timeStamp;
}


}

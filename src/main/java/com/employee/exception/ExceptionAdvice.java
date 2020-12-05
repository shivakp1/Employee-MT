package com.employee.exception;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {
	
	@ExceptionHandler({UserNotFoundException.class})
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public ErrorMessage userNotFound(Exception userException){
		System.out.println(userException);
		return new ErrorMessage(userException.getMessage(), Instant.now().toString());
	}
	
	@ExceptionHandler({MethodArgumentNotValidException.class})
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public ErrorMessage handleMessage(MethodArgumentNotValidException exception){
		System.out.println(exception.getFieldError().getDefaultMessage());
		return new ErrorMessage(exception.getFieldError().getDefaultMessage(), Instant.now().toString());
	}
	
	@ExceptionHandler(HttpMessageNotReadableException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public ErrorMessage handleParseError(HttpMessageNotReadableException exception){
		System.out.println(exception);
		return new ErrorMessage("Wrong input data", Instant.now().toString());
	}
}

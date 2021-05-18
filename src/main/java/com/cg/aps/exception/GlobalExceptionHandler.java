package com.cg.aps.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;


public class GlobalExceptionHandler {
	
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<Object> secondException(RecordNotFoundException exception)
	{
		return new ResponseEntity<>("Record not found",HttpStatus.NOT_FOUND);
	}

}

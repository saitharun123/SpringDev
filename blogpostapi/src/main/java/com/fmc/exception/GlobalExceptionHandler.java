package com.fmc.exception;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.fmc.payload.CustomExceptionResponse;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(exception = ResourceNotFoundException.class)
	public ResponseEntity<CustomExceptionResponse> resourceNotFoundException(ResourceNotFoundException rne,WebRequest webReq){
		CustomExceptionResponse response = new CustomExceptionResponse();
		response.setDate(new Date());
		response.setDetails(webReq.getDescription(false));
		response.setMessage(rne.getMessage());
		
		return new ResponseEntity(response,HttpStatus.NOT_FOUND);
	}

	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {

		Map<String,String> errors = new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach(error -> {
			String fieldName = ((FieldError) error).getField();
			String value = error.getDefaultMessage();
			errors.put(fieldName, value);
		});
		return new ResponseEntity(errors,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<CustomExceptionResponse> handleGlobalException(Exception rne,WebRequest webReq){
		CustomExceptionResponse response = new CustomExceptionResponse();
		response.setDate(new Date());
		response.setDetails(webReq.getDescription(false));
		response.setMessage(rne.getMessage());
		
		return new ResponseEntity(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}


	
}

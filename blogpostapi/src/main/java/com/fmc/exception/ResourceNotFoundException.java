package com.fmc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

	private String resourceName;
	private String fieldName;
	private Integer fieldValue;
	public ResourceNotFoundException(String resourceName, String fieldName, Integer fieldValue) {
		super(String.format("%s not found with %s : '%s'", resourceName,fieldName,fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public Integer getFieldValue() {
		return fieldValue;
	}
	public void setFieldValue(Integer fieldValue) {
		this.fieldValue = fieldValue;
	}
	
	
}

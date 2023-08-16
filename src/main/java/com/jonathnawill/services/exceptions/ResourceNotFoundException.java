package com.jonathnawill.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	
	public ResourceNotFoundException(Object id) {
		super("Resourcer not found. id " + id);
	}
	
}

package com.cg.spring.boot.demo.exception;

public class AppUserAlreadyExsitsException extends RuntimeException {

	private static final long serialVersionUID = 6488178516786684248L;

	public AppUserAlreadyExsitsException() {
		super();
	}

	public AppUserAlreadyExsitsException(String message) {
		super(message);
	}

}
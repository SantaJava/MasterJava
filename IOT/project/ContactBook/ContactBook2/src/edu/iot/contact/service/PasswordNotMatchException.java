package edu.iot.contact.service;

public class PasswordNotMatchException extends Exception{
	//Constructor
	public PasswordNotMatchException() {}
	public PasswordNotMatchException(String message) {
		super(message);
	}
}

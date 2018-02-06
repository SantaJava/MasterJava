package edu.iot.contact.service;

public class InvalidUserIdException extends Exception{
	//생성자 2개
	public InvalidUserIdException() {}
	public InvalidUserIdException(String message) {
		super(message);
	}
}

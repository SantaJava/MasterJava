package edu.iot.contact.service;

public class InvalidUserIdException extends Exception{
	//������ 2��
	public InvalidUserIdException() {}
	public InvalidUserIdException(String message) {
		super(message);
	}
}

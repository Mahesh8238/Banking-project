package com;

public class InsufficientbalanceException extends RuntimeException {
	private String message;

	InsufficientbalanceException(String message) {
		this.message = message;
	}
	@Override
	public String getMessage()
	{
		return message;
	}
	

}
//RULES FOR CREATING CUSTOM EXCEPTION
//1.create a class with the exception name
//2a.if calss extends Exception->checked Exception
//2b.if a class extends Runtime Exception->unchecked Exception
//3.Override getmessage()->varible,constructor & method
//4.invoke the exception using throw keyword & handle it using try and catch block
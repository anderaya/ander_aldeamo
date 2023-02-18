
package com.ander.aldeamo.excepciones;

public class ApiException extends RuntimeException{
	
	private int code;

	public ApiException(String message,int code) {
		super(message);
		this.code=code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	
	

}

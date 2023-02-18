package com.ander.aldeamo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ander.aldeamo.excepciones.ApiException;
import com.ander.aldeamo.excepciones.Errores;

@RestControllerAdvice
public class ControllerAdvice {
	@ExceptionHandler(value= RuntimeException.class)
	public ResponseEntity<Errores> runtimeExceptionHanlder(RuntimeException ex){
		String [] valores=ex.getMessage().split(";");
		/// mensaje - code
		Errores error= new Errores(ex.getMessage(),502);
		
		return new ResponseEntity<Errores>(error,HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(value= ApiException.class)	
	public ResponseEntity<Errores> ApiExceptionHandler(ApiException ex){

		Errores error= new Errores(ex.getMessage(),ex.getCode());
		
		return new ResponseEntity<Errores>(error,HttpStatus.valueOf(ex.getCode()));
	}
	
	
}

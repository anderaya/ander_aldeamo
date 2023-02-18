package com.ander.aldeamo.excepciones;

public class Errores {

	private String mensaje;
	
	private int code;

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}


	public Errores(String mensaje, int code) {
		super();
		this.mensaje = mensaje;
		this.code = code;
	}

	
	
}

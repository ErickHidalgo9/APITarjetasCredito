package com.ibm.academia.restapi.tarjeta.excepciones;

public class NotFoundException extends RuntimeException {

	public NotFoundException(String mensaje) {
		super(mensaje);
	}
	
	private static final long serialVersionUID = 2579238657193457415L;

}

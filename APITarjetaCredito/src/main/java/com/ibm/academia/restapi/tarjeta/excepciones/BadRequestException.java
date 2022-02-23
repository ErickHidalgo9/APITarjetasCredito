package com.ibm.academia.restapi.tarjeta.excepciones;

public class BadRequestException extends RuntimeException{

	public BadRequestException(String mensaje){
		super(mensaje);
	}
		
	
	private static final long serialVersionUID = 8658279415370187055L;

}

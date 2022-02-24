package com.ibm.academia.restapi.tarjeta.servicios;

import java.util.List;

import com.ibm.academia.restapi.tarjeta.modelo.entidades.Tarjeta;

public interface TarjetaDAO { 
	
	public List<Tarjeta> list();
	public Iterable<Tarjeta> findByPreferencia(String preferencia);
	

}

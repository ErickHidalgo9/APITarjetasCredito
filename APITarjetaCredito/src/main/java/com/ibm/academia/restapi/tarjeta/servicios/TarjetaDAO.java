package com.ibm.academia.restapi.tarjeta.servicios;

import com.ibm.academia.restapi.tarjeta.modelo.entidades.Tarjeta;

public interface TarjetaDAO extends GenericoDAO<Tarjeta> {
	
	public Iterable<Tarjeta> findByPreferencia(String preferencia);
	

}
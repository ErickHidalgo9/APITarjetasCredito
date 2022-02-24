package com.ibm.academia.restapi.tarjeta.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.restapi.tarjeta.modelo.entidades.Tarjeta;
import com.ibm.academia.restapi.tarjeta.repositorios.TarjetaRepository;

@Service
public class TarjetaDAOImpl implements TarjetaDAO { 

	@Autowired
	TarjetaRepository repository;
	
	@Transactional
	 public List<Tarjeta> list(){
	        return repository.findAll();
	    }
	
	
	@Transactional(readOnly = true)
	public Iterable<Tarjeta> findByPreferencia(String preferencia) {
		
		return repository.findByPreferencia(preferencia);
	}

}

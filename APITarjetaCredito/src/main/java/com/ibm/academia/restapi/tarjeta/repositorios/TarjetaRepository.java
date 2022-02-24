package com.ibm.academia.restapi.tarjeta.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.ibm.academia.restapi.tarjeta.modelo.entidades.Tarjeta;

@Repository
public interface TarjetaRepository extends JpaRepository<Tarjeta, Long>{
	
	public List<Tarjeta> findByPreferencia(String preferencia);
	

}


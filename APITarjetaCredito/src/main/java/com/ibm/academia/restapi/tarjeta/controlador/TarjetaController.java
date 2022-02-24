package com.ibm.academia.restapi.tarjeta.controlador;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ibm.academia.restapi.tarjeta.excepciones.NotFoundException;
import com.ibm.academia.restapi.tarjeta.modelo.entidades.Cliente;
import com.ibm.academia.restapi.tarjeta.modelo.entidades.Tarjeta;
import com.ibm.academia.restapi.tarjeta.servicios.TarjetaDAO;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;



@RestController
@RequestMapping("/restapi")
public class TarjetaController {

	private final static Logger logger = LoggerFactory.getLogger(TarjetaController.class);
	
	@Autowired
	@Qualifier("tarjetaDAOImpl")
	private TarjetaDAO tarjetaDAO;

	
	/**
	 * Endpoint para consultar todas las tarjetas
	 * @return retorna un arreglo con todas las tarjetas
	 * @NotFoundException En caso de que no existan valores en la BD
	 * @author erickhs 18-02-2022
	 */
	@ApiOperation(value = "Consultar todas las tarjetas")
	@ApiResponses({
		@ApiResponse(code=200, message="Endpoint ejecutado satisfactoriamente"),
		@ApiResponse(code=404, message="No hay elementos en la Base de datos")
	})
	@GetMapping("/tarjetas/lista")
	public ResponseEntity<?> obtenerTodas(){
		List<Tarjeta> tarjetas = tarjetaDAO.list();
		
		if(tarjetas.isEmpty())
			throw new NotFoundException("No existen tarjetas");
		
		return new ResponseEntity<List<Tarjeta>>(tarjetas,HttpStatus.OK);
	}
	
	/**
	 * Endpoint que obtiene el tipo de tarjeta adecuado de acuerdo al cliente basado en su perfil
	 * @param cliente parametro para ingresar el perfil del cliente
	 * @return un arreglo con los tipos de tarjetas adecuadas para el cliente
	 * @author erickhs 18-02-2022
	 */
	@ApiOperation(value = "Obtener el tipo de tarjeta adecuado")
	@ApiResponses({
		@ApiResponse(code=200, message="Endpoint ejecutado satisfactoriamente"),
		@ApiResponse(code=404, message="No hay elementos en la Base de datos")
	})
	@PostMapping("/tarjeta/tipo")
	public ResponseEntity<?> TipoTarjeta(@RequestBody Cliente cliente){
		
		List<Tarjeta> tarjetas = ((Collection<Tarjeta>) tarjetaDAO.findByPreferencia(cliente.getPreferencia()))
				.stream().filter(x ->
				cliente.getSalario() >= x.getSalarioMinimo()
				&& cliente.getSalario() <= x.getSalarioMaximo()
				&& cliente.getEdad() >= x.getEdadMinima()
				&& cliente.getEdad() <= x.getEdadMaxima()
						)
				.collect(Collectors.toList());
		
		List<String> tarjetasLista = tarjetas.stream().map(x -> x.getTarjetaCredito()).collect(Collectors.toList());
		logger.info("Sin coincidencia");
		
		
		return tarjetasLista.isEmpty()? new ResponseEntity<String>("No hay coincidencias", HttpStatus.OK):ResponseEntity.ok(tarjetasLista);
		
	}
	
}

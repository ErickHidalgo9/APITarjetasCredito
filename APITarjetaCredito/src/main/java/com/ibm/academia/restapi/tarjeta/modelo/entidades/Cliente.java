package com.ibm.academia.restapi.tarjeta.modelo.entidades;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente implements Serializable {

	
	
	@NotNull
	private String preferencia;
	@NotNull
	private Double salario;
	@NotNull
	private Integer edad;
	
	
	private static final long serialVersionUID = 7765530157113747092L;
}

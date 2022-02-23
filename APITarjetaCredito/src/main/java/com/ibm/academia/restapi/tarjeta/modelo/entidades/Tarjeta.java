package com.ibm.academia.restapi.tarjeta.modelo.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tarjetas", schema="tarjeta")
public class Tarjeta implements Serializable {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="preferencia", nullable = false, length = 60)
	private String preferencia;
	
	@Column(name="salario_minimo", nullable = false)
	private Double salarioMinimo;
	
	@Column(name="salario_maximo", nullable = false)
	private Double salarioMaximo;
	
	@Column(name="edad_minima", nullable = false)
	private Integer edadMinima;
	
	@Column(name="edad_maxima", nullable = false)
	private Integer edadMaxima;

	@Column(name="tarjeta_credito", nullable = false, length = 80)
	private String tarjetaCredito;

	@Column(name = "usuario_creacion", nullable = false)
	private String usuarioCreacion;
	
	@Column(name = "fecha_creacion", nullable = false)
	private Date fechaCreacion;
	
	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TarjetaCredito [id=");
		builder.append(id);
		builder.append(", preferencia=");
		builder.append(preferencia);
		builder.append(", salarioMinimo=");
		builder.append(salarioMinimo);
		builder.append(", salarioMaximo=");
		builder.append(salarioMaximo);
		builder.append(", edadMinima=");
		builder.append(edadMinima);
		builder.append(", edadMaxima=");
		builder.append(edadMaxima);
		builder.append(", tarjetaCredito=");
		builder.append(tarjetaCredito);
		builder.append(", usuarioCreacion=");
		builder.append(usuarioCreacion);
		builder.append(", fechaCreacion=");
		builder.append(fechaCreacion);
		builder.append(", fechaModificacion=");
		builder.append(fechaModificacion);
		builder.append("]");
		return builder.toString();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, preferencia, tarjetaCredito);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarjeta other = (Tarjeta) obj;
		return Objects.equals(id, other.id) && Objects.equals(preferencia, other.preferencia)
				&& Objects.equals(tarjetaCredito, other.tarjetaCredito);
	}
	
	@PrePersist
	private void antesPersistir() {
		this.fechaCreacion = new Date();
	}
	
	@PreUpdate
	private void antesActualizar() {
		this.fechaModificacion = new Date();
	}
	
	
	private static final long serialVersionUID = 4113495877159135020L;
	
	
	

}

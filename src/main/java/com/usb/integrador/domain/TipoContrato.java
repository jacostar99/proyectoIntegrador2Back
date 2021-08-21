package com.usb.integrador.domain;

import java.util.ArrayList;
import java.util.List;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org/
* www.zathuracode.org
* 
*/
@Entity
@Table ( name="tipo_contrato", schema="public" )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoContrato implements java.io.Serializable {

	private static final long serialVersionUID = 1L;


			@Id
	    @Column(name="id_tipo_contrato", unique=true, nullable=false)
		@NotNull
		private Integer idTipoContrato;
		
	
	    
						@NotNull
						@NotEmpty
			@Size(max=366)
							@Column(name="nombre"  , nullable=false  )
		private String nombre;	
        
		@OneToMany(fetch=FetchType.LAZY, mappedBy="tipoContrato")
		private List<Personal> personals = new ArrayList<>();	
        
}	
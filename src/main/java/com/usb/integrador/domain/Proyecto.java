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
@Table ( name="proyecto", schema="public" )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Proyecto implements java.io.Serializable {

	private static final long serialVersionUID = 1L;


			@Id
	    @Column(name="id_proyecto", unique=true, nullable=false)
		@NotNull
		private Integer idProyecto;
		
	
			@ManyToOne(fetch=FetchType.LAZY)
   		@JoinColumn(name="id_empresa"  	 )
		@NotNull
		private Empresa empresa;	
    		@ManyToOne(fetch=FetchType.LAZY)
   		@JoinColumn(name="id_personal"  	 )
		@NotNull
		private Personal personal;	
        
						@NotNull
							@Column(name="consecutivo"  , nullable=false  )
		private Integer consecutivo;	
    				@Column(name="estado"   )
		private String estado;	
    					@NotNull
						@NotEmpty
			@Size(max=255)
							@Column(name="nombre"  , nullable=false  )
		private String nombre;	
        
		@OneToMany(fetch=FetchType.LAZY, mappedBy="proyecto")
		private List<Control> controls = new ArrayList<>();	
        
}	
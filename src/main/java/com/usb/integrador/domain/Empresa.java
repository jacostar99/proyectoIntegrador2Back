package com.usb.integrador.domain;

import java.util.ArrayList;
import java.util.List;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table ( name="empresa", schema="public" )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empresa implements java.io.Serializable {

	private static final long serialVersionUID = 1L;


			@Id
	    @Column(name="id_empresa", unique=true, nullable=false)
		@NotNull
		private Integer idEmpresa;
		
	
	    
						@NotNull
						@NotEmpty
			@Size(max=255)
							@Column(name="abreviatura"  , nullable=false  )
		private String abreviatura;	
    				@Column(name="estado"   )
		private String estado;	
    					@NotNull
						@NotEmpty
			@Size(max=255)
							@Column(name="nit"  , nullable=false  )
		private String nit;	
    					@NotNull
						@NotEmpty
			@Size(max=255)
							@Column(name="nombre"  , nullable=false  )
		private String nombre;	
        
		@OneToMany(fetch=FetchType.LAZY, mappedBy="empresa")
		private List<Proyecto> proyectos = new ArrayList<>();	
        
}	
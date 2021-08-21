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
@Table ( name="tipo_identificacion", schema="public" )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoIdentificacion implements java.io.Serializable {

	private static final long serialVersionUID = 1L;


			@Id
	    @Column(name="id_tipo_id", unique=true, nullable=false)
		@NotNull
		private Integer idTipoId;
		
	
	    
						@NotNull
						@NotEmpty
			@Size(max=255)
							@Column(name="abreviatura"  , nullable=false  )
		private String abreviatura;	
    					@NotNull
						@NotEmpty
			@Size(max=255)
							@Column(name="nombre"  , nullable=false  )
		private String nombre;	
        
		@OneToMany(fetch=FetchType.LAZY, mappedBy="tipoIdentificacion")
		private List<Personal> personals = new ArrayList<>();	
        
}	
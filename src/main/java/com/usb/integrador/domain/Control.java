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
@Table ( name="control", schema="public" )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Control implements java.io.Serializable {

	private static final long serialVersionUID = 1L;


			@Id
	    @Column(name="id_control", unique=true, nullable=false)
		@NotNull
		private Integer idControl;
		
	
			@ManyToOne(fetch=FetchType.LAZY)
   		@JoinColumn(name="id_personal"  	 )
		@NotNull
		private Personal personal;	
    		@ManyToOne(fetch=FetchType.LAZY)
   		@JoinColumn(name="id_proyecto"  	 )
		@NotNull
		private Proyecto proyecto;	
        
					@Column(name="analisis"   )
		private Integer analisis;	
    					@NotNull
						@NotEmpty
			@Size(max=255)
							@Column(name="codigo_control"  , nullable=false  )
		private String codigoControl;	
    				@Column(name="construccion"   )
		private Integer construccion;	
    					@NotNull
						@NotEmpty
			@Size(max=1)
							@Column(name="costo"  , nullable=false  )
		private String costo;	
    					@NotNull
						@NotEmpty
			@Size(max=255)
							@Column(name="descripcion"  , nullable=false  )
		private String descripcion;	
    				@Column(name="esfuerzo"   )
		private Integer esfuerzo;	
    				@Column(name="estado"   )
		private String estado;	
    					@NotNull
							@Column(name="fecha_actualizacion"  , nullable=false  )
		private Date fechaActualizacion;	
    					@NotNull
							@Column(name="fecha_solicitud"  , nullable=false  )
		private Date fechaSolicitud;	
    					@NotNull
							@Column(name="numero_registro"  , nullable=false  )
		private Integer numeroRegistro;	
    					@NotNull
						@NotEmpty
			@Size(max=255)
							@Column(name="observaciones"  , nullable=false  )
		private String observaciones;	
    				@Column(name="pruebas"   )
		private Integer pruebas;	
    					@NotNull
						@NotEmpty
			@Size(max=255)
							@Column(name="solicitante"  , nullable=false  )
		private String solicitante;	
    					@NotNull
						@NotEmpty
			@Size(max=255)
							@Column(name="titulo"  , nullable=false  )
		private String titulo;	
    				@Column(name="valor"   )
		private Double valor;	
    					@NotNull
						@NotEmpty
			@Size(max=255)
							@Column(name="verificador"  , nullable=false  )
		private String verificador;	
        
		@OneToMany(fetch=FetchType.LAZY, mappedBy="control")
		private List<HistorialControl> historialControls = new ArrayList<>();	
        
}	
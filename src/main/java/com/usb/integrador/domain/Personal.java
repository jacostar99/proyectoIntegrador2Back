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
@Table ( name="personal", schema="public" )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personal implements java.io.Serializable {

	private static final long serialVersionUID = 1L;


			@Id
	    @Column(name="id_personal", unique=true, nullable=false)
		@NotNull
		private Integer idPersonal;
		
	
			@ManyToOne(fetch=FetchType.LAZY)
   		@JoinColumn(name="id_profesion"  	 )
		@NotNull
		private Profesion profesion;	
    		@ManyToOne(fetch=FetchType.LAZY)
   		@JoinColumn(name="id_tipo_contrato"  	 )
		@NotNull
		private TipoContrato tipoContrato;	
    		@ManyToOne(fetch=FetchType.LAZY)
   		@JoinColumn(name="id_tipo_id"  	 )
		@NotNull
		private TipoIdentificacion tipoIdentificacion;	
        
						@NotNull
						@NotEmpty
			@Size(max=255)
							@Column(name="apellidos"  , nullable=false  )
		private String apellidos;	
    					@NotNull
						@NotEmpty
			@Size(max=255)
							@Column(name="contrasena"  , nullable=false  )
		private String contrasena;	
    					@NotNull
						@NotEmpty
			@Size(max=255)
							@Column(name="correo"  , nullable=false  )
		private String correo;	
    				@Column(name="dias_disponibles_vacaciones"   )
		private Integer diasDisponiblesVacaciones;	
    				@Column(name="dias_usados"   )
		private Integer diasUsados;	
    				@Column(name="direccion"   )
		private String direccion;	
    				@Column(name="estado"   )
		private String estado;	
    				@Column(name="estado_civil"   )
		private String estadoCivil;	
    					@NotNull
							@Column(name="fecha_ingreso"  , nullable=false  )
		private Date fechaIngreso;	
    				@Column(name="fecha_nacimiento"   )
		private Date fechaNacimiento;	
    				@Column(name="genero"   )
		private String genero;	
    				@Column(name="habilidades"   )
		private String habilidades;	
    					@NotNull
						@NotEmpty
			@Size(max=255)
							@Column(name="nombre"  , nullable=false  )
		private String nombre;	
    					@NotNull
						@NotEmpty
			@Size(max=255)
							@Column(name="numero_identificacion"  , nullable=false  )
		private String numeroIdentificacion;	
    				@Column(name="rol"   )
		private String rol;	
    					@NotNull
							@Column(name="salario"  , nullable=false  )
		private Double salario;	
    				@Column(name="telefono_celular"   )
		private String telefonoCelular;	
    					@NotNull
						@NotEmpty
			@Size(max=255)
							@Column(name="telefono_fijo"  , nullable=false  )
		private String telefonoFijo;	
        
		@OneToMany(fetch=FetchType.LAZY, mappedBy="personal")
		private List<CartaLaboral> cartaLaborals = new ArrayList<>();	
    	@OneToMany(fetch=FetchType.LAZY, mappedBy="personal")
		private List<Control> controls = new ArrayList<>();	
    	@OneToMany(fetch=FetchType.LAZY, mappedBy="personal")
		private List<Proyecto> proyectos = new ArrayList<>();	
    	@OneToMany(fetch=FetchType.LAZY, mappedBy="personal")
		private List<SolicitudVacaciones> solicitudVacacioneses = new ArrayList<>();	
        
}	
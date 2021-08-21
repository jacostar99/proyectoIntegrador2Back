package com.usb.integrador.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

import javax.persistence.*;

import javax.validation.constraints.*;


/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org
* www.zathuracode.org
*
*/
@Entity
@Table(name = "rutas_aprendizaje", schema = "public")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RutasAprendizaje implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_ruta", unique = true, nullable = false)
    @NotNull
    private Integer idRuta;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    @Column(name = "descripcion", nullable = false)
    private String descripcion;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    @Column(name = "img", nullable = false)
    private String img;
    @NotNull
    @NotEmpty
    @Size(max = 50)
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    @Column(name = "url_redireccion", nullable = false)
    private String urlRedireccion;
}

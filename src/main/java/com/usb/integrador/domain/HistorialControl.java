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
@Table(name = "historial_control", schema = "public")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HistorialControl implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_historial_control", unique = true, nullable = false)
    @NotNull
    private Integer idHistorialControl;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_control")
    @NotNull
    private Control control;
    @Column(name = "analisis")
    private Integer analisis;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    @Column(name = "codigo_control", nullable = false)
    private String codigoControl;
    @Column(name = "construccion")
    private Integer construccion;
    @NotNull
    @NotEmpty
    @Size(max = 1)
    @Column(name = "costo", nullable = false)
    private String costo;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    @Column(name = "descripcion", nullable = false)
    private String descripcion;
    @Column(name = "esfuerzo")
    private Integer esfuerzo;
    @Column(name = "estado")
    private String estado;
    @NotNull
    @Column(name = "fecha_actualizacion", nullable = false)
    private Date fechaActualizacion;
    @NotNull
    @Column(name = "fecha_solicitud", nullable = false)
    private Date fechaSolicitud;
    @NotNull
    @Column(name = "numero_registro", nullable = false)
    private Integer numeroRegistro;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    @Column(name = "observaciones", nullable = false)
    private String observaciones;
    @Column(name = "pruebas")
    private Integer pruebas;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    @Column(name = "solicitante", nullable = false)
    private String solicitante;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    @Column(name = "titulo", nullable = false)
    private String titulo;
    @Column(name = "valor")
    private Double valor;
}

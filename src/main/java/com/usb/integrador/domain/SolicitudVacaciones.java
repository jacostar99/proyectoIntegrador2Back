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
@Table(name = "solicitud_vacaciones", schema = "public")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SolicitudVacaciones implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_vacaciones", unique = true, nullable = false)
    @NotNull
    private Integer idVacaciones;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_personal")
    @NotNull
    private Personal personal;
    @NotNull
    @Column(name = "fecha_desde", nullable = false)
    private Date fechaDesde;
    @NotNull
    @Column(name = "fecha_hasta", nullable = false)
    private Date fechaHasta;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    @Column(name = "nota", nullable = false)
    private String nota;
}

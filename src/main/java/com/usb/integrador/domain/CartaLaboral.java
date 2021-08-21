package com.usb.integrador.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

import javax.persistence.*;

import javax.validation.constraints.*;



@Entity
@Table(name = "carta_laboral", schema = "public")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartaLaboral implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_carta_labroal", unique = true, nullable = false)
    @NotNull
    private Integer idCartaLabroal;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_personal")
    @NotNull
    private Personal personal;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    @Column(name = "entidad_ala_que_va_dirigida", nullable = false)
    private String entidadALaQueVaDirigida;
    @NotNull
    @Column(name = "fecha", nullable = false)
    private Date fecha;
}

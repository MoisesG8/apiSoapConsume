package com.prueba.servicioSOAPGN.model;

import lombok.Data;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Data
@Entity
@Table(name = "tasa_cambio")
@Transactional
public class TasaCambio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha", nullable = false)
    private Date fecha;

    @Column(name = "tasa_venta", nullable = false)
    private BigDecimal tasaVenta;

    @Column(name = "tasa_compra", nullable = false)
    private BigDecimal tasaCompra;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "num_peticion_seq")
    @SequenceGenerator(name = "num_peticion_seq", sequenceName = "num_peticion_seq", allocationSize = 1)
    @Column(name = "num_peticion")
    private Integer numPeticion;

}
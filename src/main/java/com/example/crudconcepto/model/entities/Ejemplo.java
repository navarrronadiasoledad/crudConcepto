package com.example.crudconcepto.model.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "ejemplo")
public class Ejemplo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEjemplo;
    private String contenidoConcepto;
    private String decripcionEjemplo;
}

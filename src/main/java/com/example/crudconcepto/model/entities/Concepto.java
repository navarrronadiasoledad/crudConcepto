package com.example.crudconcepto.model.entities;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Data
@Entity
@Table(name="concepto")
public class Concepto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConcepto;
    @Column(name = "nombreConcepto")
    private String nombreConcepto;
    @Column(name = "numeroConcepto")
    private int numeroConcepto;
    @Column(name = "contenido")
    private String contenido;
}

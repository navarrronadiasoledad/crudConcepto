package com.example.crudconcepto.model.entities;

import lombok.Data;

import javax.persistence.*;

@Table(name="preguntas")
@Entity
@Data

public class Pregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPregunta;
    @Column(name = "contenido_pregunta")
    private String contenidoPregunta;

}

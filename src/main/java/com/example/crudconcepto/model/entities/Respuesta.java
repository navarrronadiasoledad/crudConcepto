package com.example.crudconcepto.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Table(name="respuesta")
@Getter
@Setter
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRespuesta;
    @Column(name = "contenido_respuestas")
    private String contenidoRespuestas;
    @Column(name = "es_correcta")
    private boolean esCorrecta;


}

package com.example.crudconcepto.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Setter
@Getter
public class DTORespuesta implements Serializable {
    private int idRespuesta;
    private String contenidoRespuestas;
    private boolean esCorrecta;
    private long idPregunta;

}

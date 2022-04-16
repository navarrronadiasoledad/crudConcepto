package com.example.crudconcepto.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
@Setter
@Getter
public class DTOPregunta implements Serializable {
    private Long idPregunta;
    private String contenidoPregunta;
    private List<DTORespuesta> listaRespuestas;
}

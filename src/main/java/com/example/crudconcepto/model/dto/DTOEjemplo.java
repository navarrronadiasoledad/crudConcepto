package com.example.crudconcepto.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class DTOEjemplo implements Serializable {
    private Long idEjemplo;
    private String contenidoConcepto;
    private String decripcionEjemplo;
}

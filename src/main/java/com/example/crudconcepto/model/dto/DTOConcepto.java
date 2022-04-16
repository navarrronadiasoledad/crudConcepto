package com.example.crudconcepto.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@NoArgsConstructor
@Data
public class DTOConcepto implements Serializable {
    private static final long serialVersionUID = 1L;
      private  Long idConcepto;
    private String nombreConcepto;
    private int numeroConcepto;
    private String contenido;
}

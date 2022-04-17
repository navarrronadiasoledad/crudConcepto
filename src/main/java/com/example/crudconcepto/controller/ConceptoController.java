package com.example.crudconcepto.controller;

import com.example.crudconcepto.model.dto.DTOConcepto;
import com.example.crudconcepto.model.entities.Concepto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ConceptoController {

      ResponseEntity crearConcepto(DTOConcepto dtoconcepto);
    List<DTOConcepto> getConcepto();
    ResponseEntity eliminar(Long id);
    ResponseEntity<Object> actuConcepto( Long id,  DTOConcepto dtoConcepto);
}

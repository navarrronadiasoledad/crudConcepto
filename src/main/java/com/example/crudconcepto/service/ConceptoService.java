package com.example.crudconcepto.service;

import com.example.crudconcepto.model.dto.DTOConcepto;
import com.example.crudconcepto.model.entities.Concepto;

import java.util.List;

public interface ConceptoService {
 String crearConcepto(DTOConcepto concepto);

  List<DTOConcepto> findAllConcepto();
 String conceptoEliminar(Long id);
 void actulizarConcepto(DTOConcepto dtoConcepto, Long id);

}

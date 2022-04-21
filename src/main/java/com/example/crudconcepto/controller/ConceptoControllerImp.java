package com.example.crudconcepto.controller;

import com.example.crudconcepto.CrudConceptoApplication;
import com.example.crudconcepto.model.dto.DTOConcepto;

import com.example.crudconcepto.service.ConceptoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;



@RestController
public class ConceptoControllerImp implements ConceptoController{
   @Autowired
   ConceptoService conceptoService;

   public static final Logger logController= LoggerFactory.getLogger(CrudConceptoApplication.class);

    @Override
    @PostMapping("/crear")
    public ResponseEntity crearConcepto(@RequestBody DTOConcepto dtoconcepto){
             logController.info("Se crea el concepto");
       logController.info(dtoconcepto.toString());
        conceptoService.crearConcepto(dtoconcepto);
      logController.info("creste un concepto");
        return ResponseEntity.ok().body("Successfully added");

    }
    @Override
    @GetMapping("/conceptos")
    public List<DTOConcepto> getConcepto(){
        logController.info("listado de concepto");
         List<DTOConcepto> conce=conceptoService.findAllConcepto();

        return conceptoService.findAllConcepto();
    }


    @Override
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity eliminar(@PathVariable Long id){
        logController.info("elimine un concepto");
        conceptoService.conceptoEliminar(id);
        logController.info("este concepto fue eliminado");
         return ResponseEntity.ok().body("successfully deleted");
    }


  @Override
  @PutMapping("/actulizar/{id}")
    public ResponseEntity<Object> actuConcepto(@PathVariable Long id,@RequestBody DTOConcepto dtoConcepto){
      conceptoService.actulizarConcepto(dtoConcepto,id);
     logController.info("concepto eliminado");
      return ResponseEntity.ok(Boolean.TRUE);
  }
}

package com.example.crudconcepto.controller;

import com.example.crudconcepto.model.dto.DTOConcepto;

import com.example.crudconcepto.service.ConceptoService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ConceptoControllerImp implements ConceptoController{
   @Autowired
   ConceptoService conceptoService;

    @Override
    @PostMapping("/crear")
    public ResponseEntity crearConcepto(@RequestBody DTOConcepto dtoconcepto){
        System.out.println("Se crea:" + dtoconcepto.toString());
        conceptoService.crearConcepto(dtoconcepto);
        return ResponseEntity.ok().body("Successfully added");

    }
    @Override
    @GetMapping("/conceptos")
    public List<DTOConcepto> getConcepto(){
      /*public ResponseEntity<List<DTOConcepto>> getConcepto(@RequestBody DTOConcepto dtoConcepto) {
      List<DTOConcepto> conce=conceptoService.findAllConcepto(dtoConcepto);
       return ResponseEntity.ok().body(conce);*/
        return conceptoService.findAllConcepto();
    }


    @Override
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity eliminar(@PathVariable Long id){
         conceptoService.conceptoEliminar(id);
         return ResponseEntity.ok().body("successfully deleted");
    }


  @Override
  @PutMapping("/actulizar/{id}")
    public ResponseEntity<Object> actuConcepto(@PathVariable Long id,@RequestBody DTOConcepto dtoConcepto){
      conceptoService.actulizarConcepto(dtoConcepto,id);
      return ResponseEntity.ok(Boolean.TRUE);
  }
    }

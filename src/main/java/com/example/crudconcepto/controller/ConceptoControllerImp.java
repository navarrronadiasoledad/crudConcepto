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
    public String crearConcepto(@RequestBody DTOConcepto dtoconcepto){
        System.out.println("Se crea:" + dtoconcepto.toString());

        return conceptoService.crearConcepto(dtoconcepto);
    }
    @Override
    @GetMapping("/conceptos")
    public List<DTOConcepto> getConcepto(){
        return conceptoService.findAllConcepto();
    }


    @Override
    @DeleteMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id){
        return conceptoService.conceptoEliminar(id);
    }


  @Override
  @PutMapping("/actulizar/{id}")
    public ResponseEntity<Object> actuConcepto(@PathVariable Long id,@RequestBody DTOConcepto dtoConcepto){
      conceptoService.actulizarConcepto(dtoConcepto,id);
      return ResponseEntity.ok(Boolean.TRUE);
  }
    }

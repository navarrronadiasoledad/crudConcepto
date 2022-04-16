package com.example.crudconcepto.service.impl;

import com.example.crudconcepto.model.dto.DTOConcepto;
import com.example.crudconcepto.model.entities.Concepto;
import com.example.crudconcepto.model.repository.ConceptoRepository;
import com.example.crudconcepto.service.ConceptoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ConceptoServiceImp implements ConceptoService {
    @Autowired
    ConceptoRepository conceptoRepository;

      ModelMapper modelMapper= new  ModelMapper();

    @Override
    public String crearConcepto(DTOConcepto dtoconcepto) {
        System.out.println("concepto creado:"+ dtoconcepto.toString());
        Concepto concepto = modelMapper.map(dtoconcepto,Concepto.class);

        conceptoRepository.save(concepto);
        return "Se ha creado un concepto";

    }
    @Override
    public List<DTOConcepto> findAllConcepto(){
        List<Concepto> conceptosLi = conceptoRepository.findAll();
        List<DTOConcepto> conceptosRest =new ArrayList<>();
        for(Concepto concepto : conceptosLi){
                 DTOConcepto conceptoRest  = modelMapper.map(concepto,DTOConcepto.class);
                 conceptosRest.add(conceptoRest);
              }
        return conceptosRest;
    }
    @Override
    public String conceptoEliminar(Long id){
        if(conceptoRepository.findById(id).isPresent()){
            conceptoRepository.deleteById(id);
            return "fue eliminado";
        }
     return "error!!";
    }
    @Override
    public void actulizarConcepto(DTOConcepto dtoConcepto,Long id){

        Concepto concepto = modelMapper.map(dtoConcepto,Concepto.class);
         Optional<Concepto> conceptoList= conceptoRepository.findById(id);
        Concepto concep=conceptoList.get();
        concep.setNombreConcepto(concepto.getNombreConcepto());
        concep.setNumeroConcepto(concepto.getNumeroConcepto());
        concep.setContenido(concepto.getContenido());

        conceptoRepository.save(concep);


        /*/*if (conceptoRepository.findById(num).isPresent()){

             conceptonew.setNombreConcepto(conceptonew.getNombreConcepto());
             conceptonew.setNumeroConcepto(conceptonew.getNumeroConcepto());
             conceptonew.setContenido(conceptonew.getContenido());
             conceptoRepository.save(conceptonew);
             conceptonew=concepto;
             dtoConcepto= modelMapper.map(concepto,DTOConcepto.class);
             return "concepto actualizado";
        }*/

    }
}

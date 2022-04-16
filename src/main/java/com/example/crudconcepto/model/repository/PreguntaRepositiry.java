package com.example.crudconcepto.model.repository;

import com.example.crudconcepto.model.dto.DTOPregunta;
import com.example.crudconcepto.model.entities.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreguntaRepositiry extends JpaRepository<Pregunta,Long> {
}

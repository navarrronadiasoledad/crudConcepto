package com.example.crudconcepto.model.repository;

import com.example.crudconcepto.model.entities.Concepto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Map;
public interface ConceptoRepository extends JpaRepository<Concepto,Long> {
}

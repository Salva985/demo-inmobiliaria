package com.example.demo.repository;

import com.example.demo.model.ContratoAlquiler;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContratoAlquilerRepository extends JpaRepository<ContratoAlquiler, Long> {
    List<ContratoAlquiler> findByActivoTrue();
    List<ContratoAlquiler> findByInquilinoId(Long inquilinoId);
}

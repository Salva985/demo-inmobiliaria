package com.example.demo.repository;

import com.example.demo.model.EstadoInmueble;
import com.example.demo.model.Inmueble;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InmuebleRepository extends JpaRepository<Inmueble, Long> {
    List<Inmueble> findByEstado(EstadoInmueble estado);
    List<Inmueble> findByPropietarioId(Long propietarioId);
}

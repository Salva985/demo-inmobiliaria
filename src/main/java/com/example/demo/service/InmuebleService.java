package com.example.demo.service;


import com.example.demo.model.EstadoInmueble;
import com.example.demo.model.Inmueble;
import com.example.demo.repository.InmuebleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InmuebleService {

    @Autowired
    private InmuebleRepository repo;

    public List<Inmueble> listarTodos() {
        return repo.findAll();
    }

    public Optional<Inmueble> obtenerPorId(Long id) {
        return repo.findById(id);
    }

    public Inmueble guardar(Inmueble inmueble) {
        return repo.save(inmueble);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }

    public List<Inmueble> buscarPorEstado(EstadoInmueble estado) {
        return repo.findByEstado(estado);
    }

    public List<Inmueble> buscarPorPropietario(Long propietarioId) {
        return repo.findByPropietarioId(propietarioId);
    }
}
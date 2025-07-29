package com.example.demo.service;


import com.example.demo.model.ContratoAlquiler;
import com.example.demo.repository.ContratoAlquilerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContratoAlquilerService {

    @Autowired
    private ContratoAlquilerRepository repo;

    public List<ContratoAlquiler> listarTodos() {
        return repo.findAll();
    }

    public List<ContratoAlquiler> listarActivos() {
        return repo.findByActivoTrue();
    }

    public List<ContratoAlquiler> listarPorInquilino(Long id) {
        return repo.findByInquilinoId(id);
    }

    public Optional<ContratoAlquiler> obtenerPorId(Long id) {
        return repo.findById(id);
    }

    public ContratoAlquiler guardar(ContratoAlquiler contrato) {
        return repo.save(contrato);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
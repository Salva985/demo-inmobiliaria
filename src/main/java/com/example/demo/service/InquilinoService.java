package com.example.demo.service;

import com.example.demo.model.Inquilino;
import com.example.demo.repository.InquilinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InquilinoService {

    @Autowired
    private InquilinoRepository repo;

    public List<Inquilino> listarTodos() {
        return repo.findAll();
    }

    public Optional<Inquilino> obtenerPortId(Long id) {
        return repo.findById(id);
    }

    public Inquilino guardar(Inquilino inquilino) {
        return repo.save(inquilino);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}

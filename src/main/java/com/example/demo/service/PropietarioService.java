package com.example.demo.service;


import com.example.demo.model.Propietario;
import com.example.demo.repository.PropietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PropietarioService {

    @Autowired
    private PropietarioRepository repo;

    public List<Propietario> listarTodos() {
        return repo.findAll();
    }

    public Optional<Propietario> obtenerPorId(Long id) {
        return repo.findById(id);
    }

    public Propietario guardar(Propietario propietario) {
        return repo.save(propietario);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
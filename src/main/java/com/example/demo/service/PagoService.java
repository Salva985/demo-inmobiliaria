package com.example.demo.service;


import com.example.demo.model.EstadoPago;
import com.example.demo.model.Pago;
import com.example.demo.repository.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagoService {

    @Autowired
    private PagoRepository repo;

    public List<Pago> listarTodos() {
        return repo.findAll();
    }

    public Optional<Pago> obtenerPorId(Long id) {
        return repo.findById(id);
    }

    public List<Pago> buscarPorContrato(Long contratoId) {
        return repo.findByContratoId(contratoId);
    }

    public List<Pago> buscarPorEstado(EstadoPago estado) {
        return repo.findByEstado(estado);
    }

    public Pago guardar(Pago pago) {
        return repo.save(pago);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
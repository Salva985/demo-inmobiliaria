package com.example.demo.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Inquilino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String dni;
    private String telefono;

    @OneToMany(mappedBy = "inquilino")
    private List<ContratoAlquiler> contratos;

    public Inquilino() {}

    public Inquilino(Long id, String nombre, String dni, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
    }

    //GETTERS SETTERS

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public List<ContratoAlquiler> getContratos() { return contratos; }
    public void setContratos(List<ContratoAlquiler> contratos) { this.contratos = contratos; }
}

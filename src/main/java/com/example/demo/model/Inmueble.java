package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inmueble {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descripcion;

    @Enumerated(EnumType.STRING)
    private EstadoInmueble estado;

    @Embedded
    private Direccion direccion;

    @ManyToOne
    private Propietario propietario;

    @OneToOne(mappedBy = "inmueble", cascade = CascadeType.ALL)
    private ContratoAlquiler contratoAlquiler;

    public void setId(Long id) {
        this.id = id;
    }
}

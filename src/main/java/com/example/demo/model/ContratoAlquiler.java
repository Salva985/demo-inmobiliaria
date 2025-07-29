package com.example.demo.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContratoAlquiler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double precioMensual;
    private Boolean activo;

    @ManyToOne
    private Inquilino inquilino;

    @OneToOne
    @JoinColumn(name = "inmueble_id")
    private Inmueble inmueble;

    @OneToMany(mappedBy = "contrato")
    private List<Pago> pagos;

    public void setId(Long id) {
        this.id = id;
    }
}
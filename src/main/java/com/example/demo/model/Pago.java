package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fechaPago;
    private Double monto;

    @Enumerated(EnumType.STRING)
    private EstadoPago estado;

    @ManyToOne
    private ContratoAlquiler contrato;

    public void setId(Long id) {
        this.id = id;
    }
}

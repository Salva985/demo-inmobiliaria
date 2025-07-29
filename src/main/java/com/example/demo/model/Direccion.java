package com.example.demo.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Direccion {
    private String calle;
    private String ciudad;
    private String provincia;
    private String codigoPostal;
}
package com.example.demo.controller;

import com.example.demo.model.Propietario;
import com.example.demo.service.PropietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/propietarios")
public class PropietarioController {

    @Autowired
    private PropietarioService propietarioService;

    // Cuando algien entre http://localhost:8080/api/propietarios con una peticion GET lanza esta funcion
    @GetMapping
    public List<Propietario> listar(){
        return propietarioService.listarTodos();
    }

    @PostMapping
    public Propietario crear(@RequestBody Propietario propietario){
        return propietarioService.guardar(propietario);
    }

}

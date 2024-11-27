package com.pruebajpa.pruebajpa.controller;

import com.pruebajpa.pruebajpa.modelo.Persona;
import com.pruebajpa.pruebajpa.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    private PersonaService personaService;


    //Traer personas
    @GetMapping("personas/traer")
    public List<Persona> traerPersonas(){
        return personaService.traerPersonas();
    }

    //Crear Persona

    @PostMapping("persona/crear")
    public String crearPersona(@RequestBody Persona persona){
        personaService.crearPersona(persona);
        return "Persona Creada, Exitosamente";
    }

}

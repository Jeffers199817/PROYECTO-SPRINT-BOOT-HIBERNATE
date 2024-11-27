package com.pruebajpa.pruebajpa.controller;

import com.pruebajpa.pruebajpa.modelo.Persona;
import com.pruebajpa.pruebajpa.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    //Traer persona

    @GetMapping("persona/traer")
    public Persona traerPersona(@RequestParam Long idPersona){

        return    personaService.traerPersona(idPersona);
    }

    //Crear Persona

    @PostMapping("persona/crear")
    public String crearPersona(@RequestBody Persona persona){
        personaService.crearPersona(persona);
        return "Persona Creada, Exitosamente";
    }

    @DeleteMapping("personas/eliminar")
    public String eliminarPersona(@RequestParam Long id){
        personaService.eliminarPersona(id);
        return "Persona Eliminada, Exitosamente";
    }

    @PutMapping("persona/editar")
    public Persona editarPersona(@RequestParam Long idOriginal, @RequestParam(required = false, name = "idnuevo") Long idNuevo ,
                                @RequestParam(required = false, name="nombre") String nombreNuevo,
                                @RequestParam(required = false, name="apellido") String apellidoNuevo,
                                @RequestParam(required = false, name="edad" ) int edadNuevo ){

        personaService.editarPersona(idOriginal, idNuevo, nombreNuevo, apellidoNuevo, edadNuevo);

         Persona persona = personaService.traerPersona(idNuevo);

        return persona;
    }

}

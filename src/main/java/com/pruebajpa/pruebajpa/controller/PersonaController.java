package com.pruebajpa.pruebajpa.controller;

import com.pruebajpa.pruebajpa.modelo.Mascota;
import com.pruebajpa.pruebajpa.modelo.Persona;
import com.pruebajpa.pruebajpa.service.MascotaService;
import com.pruebajpa.pruebajpa.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    private PersonaService personaService;
    @Autowired
    private MascotaService mascotaService;


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
                                @RequestParam(required = false, name="edad" ) int edadNuevo ,
                                @RequestParam(required = false, name="masco") Long idMasco  ){

        Mascota masco = mascotaService.traerMascota(idMasco);

        personaService.editarPersona(idOriginal, idNuevo, nombreNuevo, apellidoNuevo, edadNuevo, masco);

         Persona persona = personaService.traerPersona(idNuevo);

        return persona;
    }


    @PutMapping( "persona/editar1")
    public Persona edtarPersona1(@RequestBody Persona persona){

        personaService.editarPersona(persona);

        return personaService.traerPersona(persona.getId());

    }

}

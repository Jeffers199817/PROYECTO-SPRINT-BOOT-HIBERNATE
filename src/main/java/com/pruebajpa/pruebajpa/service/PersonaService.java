package com.pruebajpa.pruebajpa.service;

import com.pruebajpa.pruebajpa.modelo.Persona;
import com.pruebajpa.pruebajpa.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    private IPersonaRepository personaRepository;

    @Override
    public List<Persona> traerPersonas() {

        return  personaRepository.findAll();
    }

    @Override
    public Persona traerPersona(Long id) {
        Persona persona = personaRepository.findById(id).get();
        return persona;
    }

    @Override
    public void crearPersona(Persona persona) {
                personaRepository.save(persona);
    }

    @Override
    public void eliminarPersona(Long id) {
        personaRepository.deleteById(id);

    }

    @Override
    public Persona editarPersona(long idOriginal, long idNuevo, String nuevoNombre, String nuevoApellido, int nuevoEdad) {

        Persona persona = this.traerPersona(idOriginal);
        persona.setId(idNuevo);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setEdad(nuevoEdad);

        this.personaRepository.save(persona);

        return persona;

    }
}

package com.pruebajpa.pruebajpa.service;

import com.pruebajpa.pruebajpa.modelo.Persona;

import java.util.List;

public class PersonaService implements IPersonaService{
    @Override
    public List<Persona> traerPersonas() {
        return List.of();
    }

    @Override
    public Persona traerPersona(Long id) {
        return null;
    }

    @Override
    public void crearPersona(Persona persona) {

    }

    @Override
    public void eliminarPersona(Long id) {

    }

    @Override
    public void editarPersona(long idOriginal, long idNuevo, String nuevoNombre, String nuevoApellido, String nuevoEdad, String nuevaEdad) {

    }
}

package com.pruebajpa.pruebajpa.service;

import com.pruebajpa.pruebajpa.modelo.Persona;

import java.util.List;

public interface IPersonaService {

    public List<Persona> traerPersonas();
    public Persona traerPersona(Long id);
    public void crearPersona(Persona persona);
    public void eliminarPersona(Long id);
    public Persona editarPersona(long idOriginal, long idNuevo, String nuevoNombre ,String nuevoApellido, int nuevoEdad );
}

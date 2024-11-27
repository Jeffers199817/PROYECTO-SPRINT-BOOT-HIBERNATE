package com.pruebajpa.pruebajpa.service;

import com.pruebajpa.pruebajpa.modelo.Mascota;

import java.util.List;

public interface IMascotraService {



    public List<Mascota> traerMascotas();

    public Mascota traerMascota(Long id);

    public void crearMascota(Mascota mascota);

    public void eliminarMascota(Long id);

    public Mascota editarMascota(Long idOriginal , Long idNuevo, String nombreNuevo, String especieNuevo, String razaNuevo, String colorNuevo);
}

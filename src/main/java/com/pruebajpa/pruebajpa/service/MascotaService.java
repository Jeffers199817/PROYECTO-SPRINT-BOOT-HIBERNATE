package com.pruebajpa.pruebajpa.service;

import com.pruebajpa.pruebajpa.modelo.Mascota;
import com.pruebajpa.pruebajpa.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService implements IMascotraService{

    @Autowired
    private IMascotaRepository mascotaRepository;


    @Override
    public List<Mascota> traerMascotas() {
        return  mascotaRepository.findAll();
    }

    @Override
    public Mascota traerMascota(Long id) {
      Mascota masco = mascotaRepository.findById(id).get();
        return masco;
    }

    @Override
    public void crearMascota(Mascota mascota) {
        mascotaRepository.save(mascota);


    }

    @Override
    public void eliminarMascota(Long id) {
        mascotaRepository.deleteById(id);

    }

    @Override
    public Mascota editarMascota(Long idOriginal, Long idNuevo, String nombreNuevo, String especieNuevo, String razaNuevo, String colorNuevo) {

        Mascota masco = this.traerMascota(idOriginal);
        masco.setId_Mascota(idNuevo);
        masco.setNombre(nombreNuevo);
        masco.setEspecie(especieNuevo);
        masco.setRaza(razaNuevo);
        masco.setColor(colorNuevo);
        return masco;
    }
}

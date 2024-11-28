package com.pruebajpa.pruebajpa.controller;

import com.pruebajpa.pruebajpa.modelo.Mascota;
import com.pruebajpa.pruebajpa.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MascotaController {


@Autowired
    private MascotaService mascotaService;


    @GetMapping("mascotas/traer")
    public List<Mascota> traerMascotas(){

        return mascotaService.traerMascotas();
    }

    @GetMapping("mascota/traer/{id}")
    public Mascota traerMascota(@PathVariable Long id){

        return mascotaService.traerMascota(id);
    }

    @PostMapping("mascota/crear")
    public String crearMascota(@RequestBody Mascota mascota){
        mascotaService.crearMascota(mascota);
        return "Mascota creada, Exitosamente";
    }

    @DeleteMapping("mascota/eliminar")
    public String eliminarMascota(@RequestParam Long id){
        mascotaService.eliminarMascota(id);
        return "Mascota eliminada, exitosamente";
    }
    @PutMapping("mascota/editar")
    public Mascota editarMascota(@RequestParam Long idOriginal,
                                 @RequestParam(required = false, name = "id") Long idNuevo,
                                 @RequestParam(required = false, name = "nombre") String nombreNuevo,
                                 @RequestParam(required = false, name = "especie") String especieNuevo,
                                 @RequestParam(required = false, name = "raza" ) String razaNuevo,
                                 @RequestParam(required = false, name = "color") String colorNuevo){

        mascotaService.editarMascota(idOriginal, idNuevo, nombreNuevo, especieNuevo, razaNuevo, colorNuevo);

        Mascota masco = mascotaService.traerMascota(idNuevo);

        return masco;

    }
}

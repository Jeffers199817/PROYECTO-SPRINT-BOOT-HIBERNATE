package com.pruebajpa.pruebajpa.repository;

import com.pruebajpa.pruebajpa.modelo.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMascotaRepository extends JpaRepository<Mascota, Long> {
}

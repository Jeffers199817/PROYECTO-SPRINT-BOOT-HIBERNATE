package com.pruebajpa.pruebajpa.repository;

import com.pruebajpa.pruebajpa.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
}

package com.pruebajpa.pruebajpa.modelo;


import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SequenceGenerator(name = "global_seq", sequenceName = "hibernate_seq", allocationSize = 1)
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="global_seq")
    private Long id_Mascota;
    private String nombre;
    private String especie;
    private String raza;
    private String color;
}

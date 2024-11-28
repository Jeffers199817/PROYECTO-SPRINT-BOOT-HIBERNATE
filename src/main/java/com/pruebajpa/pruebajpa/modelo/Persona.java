package com.pruebajpa.pruebajpa.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SequenceGenerator(name="global_seq", sequenceName = "hibernate_seq", allocationSize = 1)
public class Persona {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE , generator = "global_seq")
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;
    @OneToOne
    @JoinColumn(name="idmascota",
            referencedColumnName="id_Mascota")
    private Mascota unaMascota;
}

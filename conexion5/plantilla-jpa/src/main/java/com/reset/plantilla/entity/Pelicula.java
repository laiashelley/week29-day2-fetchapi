package com.reset.plantilla.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="peliculas_plantilla")
public class Pelicula{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_pelicula")
    private Long idPelicula;

    @Column(name="titulo_pelicula")
    private String tituloPelicula;

    @Column(name="anyo_pelicula")
    private Integer anyoPelicula;
    
}

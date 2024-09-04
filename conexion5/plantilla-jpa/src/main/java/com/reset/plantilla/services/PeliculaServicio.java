package com.reset.plantilla.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reset.plantilla.entity.Pelicula;
import com.reset.plantilla.repository.PeliculaRepositorio;

@Service
public class PeliculaServicio {
    
    @Autowired
    private PeliculaRepositorio peliculaRepositorio;

    // ver todas las peliculas
    public List<Pelicula> listarPeliculas(){
        return peliculaRepositorio.findAll();
    }

    // ver una peli por su id
    public Optional<Pelicula> listarUnaPelicula(Long id){
        return peliculaRepositorio.findById(id);
    }

    // grabar pelicula
    public Pelicula guardarPelicula(Pelicula pelicula){
        return peliculaRepositorio.save(pelicula);
    }

    // borrar una pelicula
    public void borrarPelicula(Long id){
        peliculaRepositorio.deleteById(id);
        System.out.println("Pelicula borrada!");
    }




}

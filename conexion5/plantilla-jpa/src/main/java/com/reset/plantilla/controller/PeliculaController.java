package com.reset.plantilla.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reset.plantilla.entity.Pelicula;
import com.reset.plantilla.persisjpa.DTO.PeliculaDTO;
import com.reset.plantilla.services.PeliculaServicio;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class PeliculaController {
    
    @Autowired
    private PeliculaServicio peliculaServicio;

    // listar todas las peliculas
    // /api/listarPeliculas
    @GetMapping("/listarPeliculas")
    public List<Pelicula> consultarPeliculas(){
        return peliculaServicio.listarPeliculas();
    }

    // listar una pelicula por id
    // /api/listarPeliculas/id
    @GetMapping("/listarPeliculas/{id}")
    public Optional<Pelicula> consultarPeliculas(@PathVariable Long id){
        return peliculaServicio.listarUnaPelicula(id);
    }

    // crear pelicula
    // /api/registrarPelicula
    @PostMapping("/registrarPelicula")
    public Pelicula registPelicula(@RequestBody PeliculaDTO peliculaJson){

        Pelicula pelicula = new Pelicula();

        pelicula.setTituloPelicula(peliculaJson.getTituloPelicula());
        pelicula.setAnyoPelicula(peliculaJson.getAnyoPelicula());

        return peliculaServicio.guardarPelicula(pelicula);
    }

    // modificar pelicula
    // /api/modificarPelicula/id
    @PutMapping("/modificarPelicula/{id}")
    public Pelicula modifPelicula(@RequestBody PeliculaDTO peliculaJson, @PathVariable Long id){

        Pelicula pelicula = new Pelicula();

        pelicula.setIdPelicula(id);
        pelicula.setTituloPelicula(peliculaJson.getTituloPelicula());
        pelicula.setAnyoPelicula(peliculaJson.getAnyoPelicula());

        return peliculaServicio.guardarPelicula(pelicula);
    }

    // borrar una pelicula
    // /api/borrarPelicula/id
    @DeleteMapping("/borrarPelicula/{id}")
    public void eliminarPelicula(@PathVariable Long id){ 
        peliculaServicio.borrarPelicula(id);
    }

}

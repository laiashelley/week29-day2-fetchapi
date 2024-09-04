package com.reset.plantilla.persisjpa.DTO;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PeliculaDTO {
    
    @NotNull(message = "El año de la película no puede ser nulo")
    private String tituloPelicula;
    @NotNull(message = "El año de la película no puede ser nulo")
    private Integer anyoPelicula;

}

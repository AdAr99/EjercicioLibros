package com.adri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adri.model.Libro;
import com.adri.service.LibrosService;

@RestController
public class LibrosController {

    @Autowired
    LibrosService service;
    
    @GetMapping(value="libros", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Libro> libros(){

        return service.libros();
    }

    @GetMapping(value="libro/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Libro buscarLibro(@PathVariable("isbn") int isbn){
        return service.buscarLibro(isbn);
    }

    @PostMapping(value="libro", consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void agreagar(@RequestBody Libro libro){
        service.altaLibro(libro);
    }

    @PutMapping(value="libro", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void actualizar(@RequestBody Libro libro){
        service.actualizarLibro(libro);
    }

    @DeleteMapping(value="libro/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Libro> eliminar(@PathVariable("isbn") int isbn){
        return service.eliminarLibro(isbn);
    }

}

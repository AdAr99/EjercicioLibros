package com.adri.service;

import java.util.List;

import com.adri.model.Libro;

public interface LibrosService {
    List<Libro> libros();
    Libro buscarLibro(int isbn);
    void altaLibro(Libro libro);
    void actualizarLibro(Libro libro);
    List<Libro> eliminarLibro(int isbn);
}

package com.adri.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.adri.model.Libro;

@Service
public class LibrosServiceImpl implements LibrosService {

    List<Libro> libros;

    public LibrosServiceImpl() {
        libros = new ArrayList<>();
        libros.add(new Libro(111, "Java","programacion"));
        libros.add(new Libro(222, "CSS","web"));
        libros.add(new Libro(333, "Windows","sistemas"));
        libros.add(new Libro(444, "PHP","programacion"));

    }

    @Override
    public List<Libro> libros() {
        return libros;
    }

     @Override
    public Libro buscarLibro(int isbn) {

        Libro libroBuscar = libros.stream().
        filter(p -> p.getISBN() == isbn).
        findAny().orElse(null);

        return libroBuscar;

    }

    @Override
    public void altaLibro(Libro libro) {
        libros.add(libro);
    }

    @Override
    public void actualizarLibro(Libro libro) {

        libros = libros.stream()
        .map(libroEx -> {
            if(libroEx.getISBN() == libro.getISBN()){
                libroEx.setTitulo(libro.getTitulo());
                libroEx.setTematica(libro.getTematica());
            }
            return libroEx;
        })
        .collect(Collectors.toList());
        
    }

    @Override
    public List<Libro> eliminarLibro(int isbn) {
        Libro libEliminar = buscarLibro(isbn);

        libros.remove(libEliminar);

        return libros;
    }
    
}

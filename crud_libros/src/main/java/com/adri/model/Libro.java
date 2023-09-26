package com.adri.model;

public class Libro {

    private int isbn;
    private String titulo;
    private String tematica;

    public Libro() {
    }

    

    public Libro(int isbn, String titulo, String tematica) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.tematica = tematica;
    }

    public int getISBN() {
        return isbn;
    }

    public void setISBN(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

}

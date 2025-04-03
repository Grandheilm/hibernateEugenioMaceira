package com.anahuac.desarrollo.capas.daos;

import com.anahuac.desarrollo.capas.entidades.Libro;
import java.util.list;

public interface IDAOLibro {
    public Libro createLibro(String nombre, String autor, String isbn, String editorial);
    public Libro obtenerLibro(int id);
    public boolean modificarLibro(Libro Libro);
    public void borrarLibro(String isbn);
    public List<Libro> obtenerAllLibros();
    public Libro findByISBN(String x);
}

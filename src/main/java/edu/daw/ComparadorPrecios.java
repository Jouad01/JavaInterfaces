package edu.daw;

import java.util.Comparator;

public class ComparadorPrecios implements Comparator<Producto> {
//    metodo que compara dos productos por precio y devuelve un entero
    @Override
    public int compare(Producto p1, Producto p2) {
        return Double.compare(p2.getPrecio(), p1.getPrecio());
    }
}
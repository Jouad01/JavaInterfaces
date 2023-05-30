package edu.daw;

import java.util.ArrayList;
import java.util.Collections;

public class MenuProducto {
    public static void main(String[] args) {
//        creamos arraylist y agregamos productos
        ArrayList<Producto> listaProductos = new ArrayList<>();

        listaProductos.add(new Producto("Kebab Mixto", 4.5, "0001"));
        listaProductos.add(new Producto("Kebab Pollo", 6.5, "0002"));
        listaProductos.add(new Producto("Kebab Ternera", 5.0, "0003"));
        listaProductos.add(new Producto("Kebab Vegano", 7.0, "0004"));

//        ordenar lista por precio descendente
        Collections.sort(listaProductos, new ComparadorPrecios());

//        imprimir lista
        System.out.println("Lista ordenada por precio descendente: ");
        for (int i = 0; i < listaProductos.size(); i++) {
            System.out.println(listaProductos.get(i).getNombre() + " - PRECIO: " + listaProductos.get(i).getPrecio());
        }

//        ordenar precio ascendente
        Collections.reverse(listaProductos);


//        imprimir precio ascendente
        System.out.println("\nLista ordenada por precio ascendente: ");
        for (int i = 0; i < listaProductos.size(); i++) {
            System.out.println(listaProductos.get(i).getNombre() + " - PRECIO: " + listaProductos.get(i).getPrecio());
        }

//        buscar un producto por codigo
        int buscarCodigo = 0002;
        int posicion = 0;

        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).getCodigo().equals(String.valueOf(buscarCodigo))) {
                posicion = i;
            }
        }

        System.out.println("\nEl producto con codigo " + buscarCodigo + " es el " + listaProductos.get(posicion).getNombre());
    }
}

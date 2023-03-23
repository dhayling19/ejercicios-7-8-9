package com.example.practica_string;

import java.util.Vector;

public class VectorConCapacidadPorDefecto {


    public  static void main(String[] args) {
     Vector <Integer> elementos = new Vector<Integer>();

        for (int i = 0; i < 1000; i++){
            elementos.add(i+1);
        }
        System.out.println(elementos);


     System.out.println("tamanio "+ elementos.size() + " Capacidad "+ elementos.capacity());
    }

}

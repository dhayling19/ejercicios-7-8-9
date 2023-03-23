package com.example.practica_string;

import java.util.Vector;

public class Ejercicio4 {
    public  static void main(String[] args) {
        Vector<String> vector = new Vector <>(2);
        vector.add("Mandarina");
        vector.add("Pollo");
        vector.add("Refresco");
        vector.add("Pimenton");
        vector.add("coleto");

        System.out.println("Datos del vector : " + vector);
        vector.remove("Pollo");
        vector.remove("Refresco");
        System.out.println("Datos del vector : " + vector + " " +vector.capacity());






    }
}

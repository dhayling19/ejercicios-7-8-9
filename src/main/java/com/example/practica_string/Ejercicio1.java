package com.example.practica_string;

public class Ejercicio1 {
    public  static void main(String[] args) {

        //Ejercicio 1: Cadena al reves
        String cadena = "Mensaje de texto";
        int num = cadena.length();
        for (int i = num - 1; i > 0; i--) {
            System.out.println("Estas son las letras: " + cadena.charAt(i));
        }
    }

}

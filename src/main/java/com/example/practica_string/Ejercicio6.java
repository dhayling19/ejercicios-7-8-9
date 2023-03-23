package com.example.practica_string;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ejercicio6 {
    public  static void main(String[] args) {

        ArrayList<String> Apellidos = new ArrayList<String>();

        Apellidos.add("Polca");
        Apellidos.add("Mota");
        Apellidos.add("Roble");
        Apellidos.add("Hernandez");

        LinkedList<String> Apell = new LinkedList<String>();
        Apell.addAll(Apellidos);

       for (int i = 0; i < Apellidos.size(); i++){

           System.out.println("Valor de Apellidos "+ Apellidos.get(i) + " " + "Valor de Apell " + Apell.get(i));

       }


    }
}

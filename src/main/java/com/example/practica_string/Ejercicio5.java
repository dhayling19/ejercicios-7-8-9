package com.example.practica_string;

import java.util.ArrayList;

public class Ejercicio5 {
    public  static void main(String[] args) {

        ArrayList<Integer> Relleno = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            Relleno.add(i+1);
        }
        System.out.println(Relleno.size());
        System.out.println(Relleno);


        for (int i = 0; i < Relleno.size() -1 ; i++) {
            if (Relleno.get(i) % 2 == 0) {
                Relleno.remove(Relleno.get(i));
            }
           System.out.println("Este numero no es par " + Relleno.get(i));
        }
        System.out.println(Relleno);

    }
}

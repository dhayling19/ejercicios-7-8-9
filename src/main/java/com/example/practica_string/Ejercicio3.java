package com.example.practica_string;

public class Ejercicio3 {
    public  static void main(String[] args) {
        int bidimen[][] = new int[3][5];

        for (int i = 0; i < bidimen.length; i++) {
            System.out.println("Valor de la fila es : " + i);
            for (int j = 0; j < bidimen[1].length; j++) {
                System.out.println("Estoy en la fila " + i + " la columna es " + j);
                System.out.println(bidimen[i][j]);
            }
        }
    }
}

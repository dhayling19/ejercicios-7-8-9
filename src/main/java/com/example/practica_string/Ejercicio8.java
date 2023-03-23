package com.example.practica_string;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Ejercicio8 {
    public  static void main(String[] args) {
        fiche("C:\\Users\\danie\\Documents\\flores.txt", "C:\\Users\\danie\\Documents\\gatos.txt");
    }

    public static void fiche(String fileInt, String fileOut) {
        try {
            InputStream in = new FileInputStream(fileInt);
            byte[] informacion  = in.readAllBytes();

            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(informacion);
            out.close();

        } catch (Exception e) {
            System.out.println("Exception :" + e.getMessage());
        }
    }


}

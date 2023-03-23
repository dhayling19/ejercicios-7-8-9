package com.example.practica_string;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.util.*;


public class HelloApplication {
    public static void main(String[] args) {
        nuevoAnoEscolar("C:\\Users\\danie\\Documents\\Seccion4toB.txt", "C:\\Users\\danie\\Documents\\Seccion5toB.txt");
    }
    public static void nuevoAnoEscolar(String seccionVieja, String seccionNueva) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HashMap<String, String>> alumnos = new ArrayList();
        String nombre, apellido, ingresar, eliminar, names, lastName;

        try {
            InputStream in = new FileInputStream(seccionVieja);
            byte[] infor = in.readAllBytes();
            String s = new String(infor, StandardCharsets.UTF_8);
            String[] pairs = s.split(",");


            for (String pair : pairs) {
                String[] parts = pair.split("=");
                String key = parts[0];
                String value = parts[1];
                HashMap<String, String> map = new HashMap<String, String>();
                map.put(key, value);
                alumnos.add(map);
            }
            System.out.println(alumnos);

            do {
                System.out.println("Desea ingresar un alumno. Escriba si ");
                ingresar = sc.nextLine();

                if (ingresar.equals("si")) {
                    HashMap<String, String> map = new HashMap<String, String>();
                    System.out.println("Introduce el apellido");
                    apellido = sc.nextLine();
                    System.out.println("Introduce el nombre");
                    nombre = sc.nextLine();
                    map.put("apellido", apellido);
                    map.put("nombre", nombre);
                    alumnos.add(map);
                    
                }
            } while (ingresar.equals("si"));

            System.out.println("Tienes un array con: " + alumnos);



            do {
                System.out.println("Desea eliminar un alumno. Escriba si ");
                eliminar = sc.nextLine();

                if (eliminar.equals("si")) {
                    HashMap<String, String> map = new HashMap<String, String>();
                    System.out.println("Introduce el apellido");
                    lastName = sc.nextLine();
                    System.out.println("Introduce el nombre");
                    map.put("apellido", lastName);
                    names = sc.nextLine();
                    map.put("nombre", names);
                    alumnos.remove(alumnos.indexOf(map));
                    System.out.println(alumnos);
                }
            } while (eliminar.equals("si"));
            System.out.println("Tienes un array con: " + alumnos);
            in.close();

            PrintStream out = new PrintStream(seccionNueva);
            out.write(String.valueOf(alumnos).getBytes());
            out.close();
            
        } catch (Exception e) {
            System.out.println("Exception :" + e.getMessage());
        }
    }

}


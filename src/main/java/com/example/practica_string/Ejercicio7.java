package com.example.practica_string;

public class Ejercicio7 {
    public  static void main(String[] args) {
          dividePorCero(27, 3);
    }
    public static int dividePorCero(int a, int b) throws ArithmeticException{
        int total = 0;
        try{
            total = a / b;
            System.out.println(total);

        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally{
            System.out.println("Demo de codigo");
        }
        return total;

    }

}

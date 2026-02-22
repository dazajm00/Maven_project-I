package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Persona persona1 = new Persona(12345, "juan@gmail.com", "juan" );
        String  obtenerSaludo = persona1.hablar("hola como tas?");
        System.out.println(obtenerSaludo); 
        System.out.println("terminó");
    }
}
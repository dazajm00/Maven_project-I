package com.example;

// este es la clase molde de la persona, para crear personas.
public class Persona {
      //Estos son los atributos que identifican a una persona.
        int cedula;
        String nombre;
        String correo;
//constructor metodo inicial de la clase, se ejecuta inmediatamente creemos un objeto o una instancia de la clase.
    public Persona(int cedula, String correo, String nombre) {
        this.cedula = cedula;
        this.correo = correo;
        this.nombre = nombre;
        System.out.println("se ejecuto el constructor con la cedula, correo y nombre");
    }

    public Persona() {
        System.out.println("aqui seejecuto el constructor");
    }

    public Persona(int cedula) {
        System.out.println("se ejecuto el constructor con la cedula");
        this.cedula = cedula;
    }
//aqui creamos los metodos que indican las acciones que pueden ejecutar o hacer una persona.
public String hablar(String saludo){
    System.out.println("el metodo hablar se ejecutó");
    return saludo +", "+ this.nombre;

}   
        
}

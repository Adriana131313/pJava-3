package com.company;

public class Vehiculo {
    private String matricula;
    private int velocidad;

    // Tanto Camion como Coche son subclases de la clase Vehiculo. Ambas heredan sus atributos matricula y velocidad.
    // Both the Truck class and the Car class are subclasses of the Vehicle class. They both inherit their speed and log attributes.

    //Constructores

    public Vehiculo (){

    }

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    public Vehiculo(int velocidad) {
        this.velocidad = velocidad;
    }

    //getters y setters


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}

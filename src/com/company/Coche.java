package com.company;

public class Coche extends Vehiculo{
    //add color

    //atributos que se va definir el coche
    public String marca;
    public String modelo;
    public String color;
    public String marcaNeumaticos;
    private double velocidad=0;
    public int rueda;

    //here we have created an empty constructor, which creates a car with nothing
     public Coche (){
        marca = "";
        modelo= "";
     }

    //getters y setters


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Coche(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.marcaNeumaticos= "Ford";
    }

    // toString
    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color=" + color + '\'' +
                ", marcaNeumaticos='" + marcaNeumaticos + '\'' +
                '}';
    }

    //Increase speed

    public void acelerar(double cantidad) // queremos aumentar velocidad
    {
        velocidad+=cantidad; // velocidad=velocidad+ cantidad
    }

    // slow down the speed
    public void frenar(double cantidad) // aqui vamos a frenar por lo cual queremos disminuir la velocidad
    {
        velocidad-=cantidad;
    }

    // now I create a method that returns the speed

    public double obtenerVelocidad() // cada vz que hacemos hay q devovler la sentencia con return
    {
        return velocidad;
    }

    //Behavior of the car
    public void avanzar (){

    }

    public void parar(){

    }

    public void girarIzquierda(){

    }

    public void girarDerecha(){

    }
}

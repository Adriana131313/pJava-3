package com.company;

public class Bicicleta extends Vehiculo {

    public String marca;
    public String modelo;
    public int rueda;

    public Bicicleta (){
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

    // toString


    @Override
    public String toString() {
        return "Bicicleta{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", rueda=" + rueda +
                '}';
    }
}

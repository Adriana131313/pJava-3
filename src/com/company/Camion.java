package com.company;

public class Camion extends Vehiculo{
    //Construction

    public String marca;
    public String modelo;
    public String marcaNeumaticos;
    public int rueda;

    public Camion (){

    }

    //getter y setter

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

    public String getMarcaNeumaticos() {
        return marcaNeumaticos;
    }

    public void setMarcaNeumaticos(String marcaNeumaticos) {
        this.marcaNeumaticos = marcaNeumaticos;
    }

    public int getRueda() {
        return rueda;
    }

    public void setRueda(int rueda) {
        this.rueda = rueda;
    }

    // toString

    @Override
    public String toString() {
        return "Camion{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marcaNeumaticos='" + marcaNeumaticos + '\'' +
                ", rueda=" + rueda +
                '}';
    }
}
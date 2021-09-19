package com.company;
//import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Locomotora extends Vehiculo {

    public String marca;
    public String marcaNeumaticos;
    private double velocidad=0;
    public int rueda;

    // informacion de los vagones que hay de locomotoras cuandos hacen su camino hacia arriba o abajo.
    // information of the wagons there are of locomotives when they make their way up or down


    //getter y setter


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
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
        return "Locomotora{" +
                "marca='" + marca + '\'' +
                ", marcaNeumaticos='" + marcaNeumaticos + '\'' +
                ", velocidad=" + velocidad +
                ", rueda=" + rueda +
                ", Locomotora=" + Arrays.toString(Locomotora) +
                '}';
    }

    private vagonCantidad[] Locomotora;
    Locomotora(){
        this(4);
    }
    Locomotora (int numVagones){
        Locomotora = new vagonCantidad[numVagones];
        for (int i=0; i<Locomotora.length; i++){
            Locomotora[i] = new vagonCantidad(2);
        }
    }
    public int subir (NombreV p, int vagon){
        vagon = vagon-1;
        int contador = 0;
        boolean sentado = false;
        if (vagon<0 || vagon>=Locomotora.length){
            throw new RuntimeException("El vagón no existe.");
        }
        while (contador<Locomotora.length & !sentado){
            try{
                sentado = true;
                Locomotora[vagon].subir(p);
            }

            //  Instructions when an exception is being
            catch(RuntimeException e){
                sentado = false;
            }
            vagon=(vagon+1)%Locomotora.length;
            contador++;
        }
        if (!sentado)
            throw new RuntimeException("El tranvía está lleno.");
        if (vagon == 0)
            vagon = Locomotora.length;
        return vagon;
    }
    public NombreV bajar (String nombre, int vagon){
        vagon = vagon-1;
        return Locomotora[vagon].bajar(nombre);
    }
}

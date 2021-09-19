package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here
        String marca = "seat", modelo = "ibiza";
        Coche miCoche = new Coche(marca, modelo,"verde" );

        // este es nuevo tren el maquinista lo hemos puesto anonimo
        Tren primero =new Tren();
        Tren segundo =new Tren("Jose Palacio",2);
        //System.out.println(primero.antiguedad);
        //System.out.println(segundo.maquinista);
        primero.maquinista = "Amelia garcia";
        //System.out.println(primero.maquinista);
        // ahora queremos consultar cuantos pasajeros hay en el vagon número 1
        primero.CompletarVagon(2);
        System.out.println(primero.Vagones[2][1]);
        primero.AñadirPasajero(2,2);
}
}

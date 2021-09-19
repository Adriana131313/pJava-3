package com.company;
//import java.util.ArrayList;

public class Tren {

    // Train characteristics


    int Vagones[][] = new int[5][2];
    public String maquinista;
    public int antiguedad;
    //enum class creation for possible values that the color of each vehicle can take

    public int numRuedas;

    public Tren(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public String getPesoCarga() {
        return getPesoCarga();
    }

    public class Carga {
    }

    // la idea es recorrer el arrays y se suma el peso de cada vagon
    //the idea is to go through the arrays and add the weight of each wagon
     /*
    public Tren1 (){
        this.arrayvagones = new ArrayList();
    }
    public void enganchar (Vagon v){
        this.arrayvagones.add(v);}

    int pesoTotal = 0;
   for(Vagon vagon: arrayvagones){
    pesoTotal += vagon.getPesoCarga();
}
   */

    public Tren() {

   //add wagon
        int i, j;
        for (i = 0; i <= 4; i++) {

            //Here we are listing how many seats each train will have
            Vagones[i][0] = (i + 1) * 10;
            Vagones[i][1] = 0; // Here in this case the route is starting, the train has 0 passengers
        }
        maquinista = "Anonimo";
        antiguedad = 0;
    }

    //we want to calculate how many wagons are
    //how many passed can you ride on the wagons

    public Tren(String nombre, int anios) { // here is getting how old is the machinist
        int i, j;
        for (i = 0; i <= 4; i++) {
            Vagones[i][0] = (i + 1) * 10;
            Vagones[i][1] = 0; // here in this case the journey is starting the train has 0 passengers
        }
        maquinista = nombre;
        antiguedad = anios;

    }
    //this function adds the solo in void because I don't want to complete the function
    public void CompletarVagon (int vagon){
        Vagones[vagon][1] = Vagones [vagon][0];
        // as arrays and matrices count a number less so I have placed a +1
        System.out.println("el vagon " + (vagon+1) + " =) ahora esta lleno");
    }

    // add passengers in the carriages
    public void AñadirPasajero (int vagon, int pasajeros){
        //If there are more passengers than the capacity then I will show a message advising
        if (Vagones [vagon][1] + pasajeros > Vagones [vagon][0]){
            System.out.println("no existen tantos asientos en el vagon "+ (vagon+1));
        }
        else { // here we are putting the number of wagons
            Vagones[vagon][1] = Vagones[vagon][1] + pasajeros;
        }
        System.out.println("Lo sentimos :(, la reserva ha sido completado . Vuelve a intentar mas tarde ");
    }

}
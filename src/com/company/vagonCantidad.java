package com.company;

public class vagonCantidad {

    //vagon representa un vagon del tren esta separado por un nombre
    //  wagon represents a train wagon is separated by a name
    //vagonCantidad represnta la variable para calcular cantidad de vagones del tres lo etsamos haciendo en fuyncion de que cada bagon tiene nombre
    //wagon of three we have represented a train wagon is separated by a name

    private NombreV[] vagonX;
    private Nodo primero = null;
    private Nodo ultimo = null;
    private class Nodo {
        public int asiento;
        public Nodo sig;
    }
    vagonCantidad(int capacidad){
        vagonX = new NombreV[capacidad];
        for (int i=0; i < vagonX.length; i++){
            Nodo nuevo = new Nodo();
            nuevo.asiento = i;
            nuevo.sig = null;
            if (primero == null)
                primero = nuevo;
            else
                ultimo.sig = nuevo;
            ultimo = nuevo;
        }
    }
    public void subir (NombreV pasajero){
        if (lleno()){
            throw new RuntimeException("El vagón está lleno");
        }
        vagonX[primero.asiento] = pasajero;
        primero = primero.sig;
    }
    public NombreV bajar (String nombre){
        int i=0;
        boolean encontrado = false;
        Nodo nuevo;
        NombreV aux = null;
        while (i<vagonX.length & !encontrado){
            if (vagonX[i] != null && nombre.equalsIgnoreCase(vagonX[i].getNombre())){
                aux = new NombreV(vagonX[i].getNombre());
                vagonX[i] = null;
                nuevo = new Nodo();
                nuevo.asiento = i;
                nuevo.sig = null;
                if (primero == null)
                    primero = nuevo;
                else
                    ultimo.sig = nuevo;
                ultimo = nuevo;
                encontrado = true;
            }
            i++;
        }
        return aux;
    }
    private boolean lleno(){
        return primero == null;
    }

}

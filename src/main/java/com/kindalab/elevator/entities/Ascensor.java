
package com.kindalab.elevator.entities;

public class Ascensor {
    
    // Declaro las variables que necesito para armar cualquiera de los dos ascensores //
    
    // Por si quisiera que se muestre en qué piso se encuentra el usuario
    private int pisoActual;
    
    private int pesoMax = 3000;
    
    // ------------------------------------------------------------------------------ //
    
    public Ascensor(int pesoMax) {
        this.pesoMax = pesoMax;
    }

    public Ascensor() {
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }

    public int getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(int pesoMax) {
        this.pesoMax = pesoMax;
    }

    // --------------------------------------- //
    // Métodos para manejo de ambos ascensores //
    // --------------------------------------- //
    
    public boolean puedeCargar(int peso) {
       if(peso > pesoMax) {
          this.msjErrorPeso();
          return false;
       } 
       return true;
    }
    
    public boolean puedeIrAlPiso(int nroPiso, int peso) {
        if(puedeCargar(peso)) {
            this.pisoActual = nroPiso;
            System.out.println("Llegó al piso " + nroPiso);
            return true;
        }
        return false;
    }
    
    public void msjErrorPeso() {
        System.out.println("Se excedió el peso soportado por el ascensor.");
    }
    
}

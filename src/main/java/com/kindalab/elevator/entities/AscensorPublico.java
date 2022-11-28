
package com.kindalab.elevator.entities;


import java.util.Arrays;
import java.util.List;


public class AscensorPublico extends Ascensor {
    
    // Declaro las variables que necesito para armar el ascensor público //
    
    private Keycard keycard;
    private final List<Integer> pisosRestringidos = Arrays.asList(-1, 50);
    
    // ----------------------------------------------------------------- //

    public AscensorPublico() {
        super(1000);
    }


    public Keycard getKeycard() {
        return keycard;
    }

    public void setKeycard(Keycard keycard) {
        this.keycard = keycard;
    }

    public List<Integer> getPisosRestringidos() {
        return pisosRestringidos;
    }
    
    // ---------------------------------------- //
    // Métodos para manejo del ascensor público //
    // ---------------------------------------- //
    
    public boolean requiereKeycard(int nroPiso) {
        return pisosRestringidos.contains(nroPiso);
    }
    
    
    public boolean puedeIrAlPiso(int nroPiso, int peso, Keycard kc) {

        if (!requiereKeycard(nroPiso) || (requiereKeycard(nroPiso) && kc != null) ) {
            return super.puedeIrAlPiso(nroPiso, peso);
        } else {
            this.msjErrorAutorizacion();
            return false;
        } 
    }

    public void msjErrorAutorizacion() {
        System.out.println("No puede ir al piso seleccionado sin una keycard.");
    }
}


package com.kindalab.elevator.entities;

// Esta clase está pensada para extender las propiedades y funciones del
// objeto keycard.
public class Keycard {
    
    
    private Integer id;
    //--------------------------//
    
    public Keycard() {
    }

    public Keycard(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    
}


package com.mycompany.amper_at4;

public class Airplane extends AirVehicle {
    private int numEngines;

    public Airplane(int maxSpeed, boolean hasWings, int numEngines) {
        super("Airplane", maxSpeed, hasWings);
        this.numEngines = numEngines;
    }
    
    public boolean hasCockpit() {
        return true;
    }
}
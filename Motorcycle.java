
package com.mycompany.amper_at4;

public class Motorcycle extends LandVehicle {
    private boolean hasSidecar;

    public Motorcycle(int maxSpeed, int numWheels, boolean hasSidecar) {
        super("Motorcycle", maxSpeed, numWheels);
        this.hasSidecar = hasSidecar;
    }

    public boolean hasHandlebars() {
        return true;
    }
    
    public boolean isTwoWheeled() {
        return this.numWheels == 2;
    }
}
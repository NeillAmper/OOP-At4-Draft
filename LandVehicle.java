
package com.mycompany.amper_at4;

public class LandVehicle extends Vehicle {
    protected int numWheels;

    public LandVehicle(String type, int maxSpeed, int numWheels) {
        super(type, maxSpeed);
        this.numWheels = numWheels;
    }

    public boolean hasTires() {
        return numWheels > 0;
    }
}

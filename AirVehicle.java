
package com.mycompany.amper_at4;

public class AirVehicle extends Vehicle {
    protected boolean hasWings;

    public AirVehicle(String type, int maxSpeed, boolean hasWings) {
        super(type, maxSpeed);
        this.hasWings = hasWings;
    }

    public boolean canFly() {
        return true; // Assumes all air vehicles can fly
    }
}
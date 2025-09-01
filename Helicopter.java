
package com.mycompany.amper_at4;

public class Helicopter extends AirVehicle {
    private double rotorDiameter;

    public Helicopter(int maxSpeed, double rotorDiameter) {
        super("Helicopter", maxSpeed, false); // Helicopters don't have wings
        this.rotorDiameter = rotorDiameter;
    }

    public boolean hasRotorBlades() {
        return true;
    }

    public boolean canHover() {
        return true;
    }
}
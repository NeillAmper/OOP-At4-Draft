
package com.mycompany.amper_at4;

public class Ship extends WaterVehicle {
    private double displacement;

    public Ship(int maxSpeed, String hullMaterial, double displacement) {
        super("Ship", maxSpeed, hullMaterial);
        this.displacement = displacement;
    }

    public boolean hasCargoHold() {
        return true;
    }
}
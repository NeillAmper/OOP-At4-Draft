
package com.mycompany.amper_at4;

public class Boat extends WaterVehicle {
    private double keelLength;

    public Boat(int maxSpeed, String hullMaterial, double keelLength) {
        super("Boat", maxSpeed, hullMaterial);
        this.keelLength = keelLength;
    }

    public boolean isSailPowered() {
        return false; // Example value
    }
    
    public boolean hasKeel() {
        return keelLength > 0;
    }
}
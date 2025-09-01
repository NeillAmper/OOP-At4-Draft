
package com.mycompany.amper_at4;

public class Truck extends LandVehicle {
    private double loadCapacity;
    private String cargoType;

    public Truck(int maxSpeed, int numWheels, double loadCapacity, String cargoType) {
        super("Truck", maxSpeed, numWheels);
        this.loadCapacity = loadCapacity;
        this.cargoType = cargoType;
    }

    public boolean hasTrailer() {
        return true; // Example value
    }
}
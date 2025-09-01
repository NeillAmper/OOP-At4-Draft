
package com.mycompany.amper_at4;

public class Car extends LandVehicle {
    private int numDoors;

    public Car(int maxSpeed, int numWheels, int numDoors) {
        super("Car", maxSpeed, numWheels); // Type is hardcoded as "Car"
        this.numDoors = numDoors;
    }

    public boolean hasTrunk() {
        return true;
    }
}

package com.mycompany.amper_at4;

public class WaterVehicle extends Vehicle {
    protected String hullMaterial;

    public WaterVehicle(String type, int maxSpeed, String hullMaterial) {
        super(type, maxSpeed);
        this.hullMaterial = hullMaterial;
    }

    public boolean isSeaworthy() {
        return true; // Assumes it's seaworthy for this example
    }
    
    public boolean hasHull() {
        return hullMaterial != null && !hullMaterial.isEmpty();
    }
}
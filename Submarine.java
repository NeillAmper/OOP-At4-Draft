
package com.mycompany.amper_at4;

public class Submarine extends WaterVehicle {
    private int maxDepth;
    private int torpedoCount;

    public Submarine(int maxSpeed, String hullMaterial, int maxDepth, int torpedoCount) {
        super("Submarine", maxSpeed, hullMaterial);
        this.maxDepth = maxDepth;
        this.torpedoCount = torpedoCount;
    }

    public boolean canSubmerge() {
        return true;
    }
    
    public boolean hasTorpedoes() {
        return torpedoCount > 0;
    }
}
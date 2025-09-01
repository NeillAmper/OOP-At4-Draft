
package com.mycompany.amper_at4;

public class Vehicle {
    protected String type;
    protected int maxSpeed;

    public Vehicle(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

    public void start() {
        System.out.println("The " + type + " is starting.");
    }

    public void stop() {
        System.out.println("The " + type + " is stopping.");
    }
}

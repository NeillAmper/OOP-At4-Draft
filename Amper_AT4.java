
package com.mycompany.amper_at4;

public class Amper_AT4 {

    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car(200, 4, 4);
        System.out.println("--- Testing Car ---");
        myCar.start();
        System.out.println("Max Speed: " + myCar.maxSpeed + " kph");
        System.out.println("Has Trunk? " + myCar.hasTrunk());
        System.out.println("Has Tires? " + myCar.hasTires());
        myCar.stop();
        
        System.out.println("\n--- Testing Helicopter ---");
        Helicopter myHeli = new Helicopter(350, 10.5);
        myHeli.start();
        System.out.println("Can it fly? " + myHeli.canFly());
        System.out.println("Can it hover? " + myHeli.canHover());
        myHeli.stop();

        System.out.println("\n--- Testing Submarine ---");
        Submarine mySub = new Submarine(45, "Titanium Alloy", 900, 8);
        mySub.start();
        System.out.println("Is it seaworthy? " + mySub.isSeaworthy());
        System.out.println("Can it submerge? " + mySub.canSubmerge());
        System.out.println("Has torpedoes? " + mySub.hasTorpedoes());
        mySub.stop();
    }
}
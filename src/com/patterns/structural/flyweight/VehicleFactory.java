package com.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {
    /**
     * Building a new vehicle is a very expensive operation so the factory will only create one vehicle per color.
     */
    private static final Map<Color, Vehicle> vehiclesCache = new HashMap<>();

    /**
     * Notice how the client code can only affect the extrinsic state of the object (the color of our vehicle)
     * passing it as an argument to the createVehicle method.
     */
    public static Vehicle createVehicle(Color color) {
        Vehicle newVehicle = vehiclesCache.computeIfAbsent(color, newColor -> {
            // Engine is intrinsic state
            Engine newEngine = new Engine();
            return new Car(newEngine, newColor);
        });
        return newVehicle;
    }
}

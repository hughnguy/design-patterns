package com.structural.flyweight;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Flyweight is a structural design pattern that lets you fit more objects into the available amount of RAM by
 * sharing common parts of state between multiple objects instead of keeping all of the data in each object.
 *
 * One important feature of flyweight objects is that they are immutable.
 * This means that they cannot be modified once they have been constructed.
 *
 * The goal of the flyweight pattern is to reduce memory usage by sharing as much data as possible.
 * A classic example of this usage is in a word processor. Here, each Character object is a flyweight object which shares
 * the data needed for the rendering. As a result, only the position of the character inside the document takes up additional memory.
 */
public class Main {
    private static final Random random = new Random();
    private static final List<Color> values = Arrays.asList(Color.values());

    /**
     * Same existing vehicle (flyweight object) is returned per color
     */
    public static void main(String[] args) {
        for(int i=0; i < 20; ++i) {
            VehicleFactory.createVehicle(randomColor());
        }
    }

    public static Color randomColor()  {
        return values.get(random.nextInt(Color.values().length));
    }
}

package com.patterns.structural.bridge;

import com.patterns.structural.bridge.color.Blue;
import com.patterns.structural.bridge.shape.Shape;
import com.patterns.structural.bridge.shape.Square;

/**
 * Bridge pattern lets you split a large class or a set of closely related classes
 * into two separate hierarchies.
 *
 * Say you have a geometric Shape class with a pair of subclasses: Circle and Square. You want to extend this class
 * hierarchy to incorporate colors, so you plan to create Red and Blue shape subclasses. However, since you already
 * have two subclasses, you’ll need to create four class combinations such as BlueCircle and RedSquare.
 * Adding new shape types and colors to the hierarchy will grow it exponentially
 *
 * You can instead extract one of the dimensions into a separate class hierarchy, so that the original classes will reference
 * an object of the new hierarchy, instead of having all of its state and behaviors within one class.
 *
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Instead of creating a BlueSquare subclass,
         * you can create a color interface which acts as a bridge
         * for the shape to support different colors
         */
        Shape square = new Square(new Blue());
        String test = square.draw();
        System.out.println(test);
    }
}

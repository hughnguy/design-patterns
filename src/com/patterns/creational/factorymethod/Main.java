package com.patterns.creational.factorymethod;

import com.patterns.creational.factorymethod.shape.Shape;

public class Main {
    /**
     * Provides an interface for creating objects of a superclass, but lets subclasses decide which classes to instantiate. (Circle, Square, etc)
     *
     * Create object without exposing the creation logic to the client and refer to newly created object using a common interface (Shape).
     *
     * Factory Method is similar to Abstract Factory but without the emphasis on families.
     *
     * Note: Often, designs start out using Factory Method (less complicated, more customizable, subclasses proliferate)
     * and evolve toward Abstract Factory, Prototype, or Builder (more flexible, more complex) as the designer discovers
     * where more flexibility is needed.
     *
     * Factory Method: creation through inheritance. Prototype pattern: creation through delegation.
     */
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}

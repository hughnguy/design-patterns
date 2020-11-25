package com.patterns.creational.abstractfactory;

import com.patterns.creational.abstractfactory.factory.AbstractFactory;
import com.patterns.creational.abstractfactory.shape.Shape;

public class Main {
    /**
     * Produce families of related objects without specifying their concrete classes.
     *
     * Used to create an instance of several families of classes. Abstract factory pattern
     * works around a factory producer which creates other factories (factory of factories).
     *
     * This mechanism makes exchanging product families easy because the specific class of the factory object
     * appears only once in the application - where it is instantiated.
     *
     * The application can wholesale replace the entire family of products simply by instantiating a
     * different concrete instance of the abstract factory.
     *
     * note:
     * - Abstract Factory emphasizes a family of product objects (either simple or complex).
     * - Builder pattern focuses on constructing a complex object step by step.
     * - Builder pattern returns the product as a final step, but as far as the Abstract Factory is concerned, the product gets returned immediately.
     */
    public static void main(String[] args) {
        // Use factory producer to get different factories
        AbstractFactory factory = FactoryProducer.getFactory(false);

        // You can easily replace all the shapes with rounded ones by returning this factory inside
        // and not need to modify any existing logic below
        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);

        Shape shape1 = factory.getShape("RECTANGLE");
        Shape shape2 = factory.getShape("SQUARE");
        shape1.draw();
        shape2.draw();
    }
}

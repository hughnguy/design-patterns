package com.creational.abstractfactory;

import com.creational.abstractfactory.factory.AbstractFactory;
import com.creational.abstractfactory.shape.Shape;

public class Main {
    /**
     * Used to create an instance of several families of classes. Abstract factory pattern
     * works around a factory producer which creates other factories.
     *
     * This mechanism makes exchanging product families easy because the specific class of the factory object
     * appears only once in the application - where it is instantiated.
     *
     * The application can wholesale replace the entire family of products simply by instantiating a
     * different concrete instance of the abstract factory.
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

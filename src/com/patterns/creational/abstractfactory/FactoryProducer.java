package com.patterns.creational.abstractfactory;

import com.patterns.creational.abstractfactory.factory.AbstractFactory;
import com.patterns.creational.abstractfactory.factory.RoundedShapeFactory;
import com.patterns.creational.abstractfactory.factory.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded){
        if(rounded){
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}

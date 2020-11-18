package com.creational.abstractfactory;

import com.creational.abstractfactory.factory.AbstractFactory;
import com.creational.abstractfactory.factory.RoundedShapeFactory;
import com.creational.abstractfactory.factory.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded){
        if(rounded){
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}

package com.patterns.creational.abstractfactory.factory;

import com.patterns.creational.abstractfactory.shape.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);
}

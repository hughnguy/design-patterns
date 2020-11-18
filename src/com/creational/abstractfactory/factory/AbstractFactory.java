package com.creational.abstractfactory.factory;

import com.creational.abstractfactory.shape.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);
}

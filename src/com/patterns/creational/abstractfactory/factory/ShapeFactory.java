package com.patterns.creational.abstractfactory.factory;

import com.patterns.creational.abstractfactory.shape.Rectangle;
import com.patterns.creational.abstractfactory.shape.Shape;
import com.patterns.creational.abstractfactory.shape.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}

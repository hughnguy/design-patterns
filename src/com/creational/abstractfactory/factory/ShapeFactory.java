package com.creational.abstractfactory.factory;

import com.creational.abstractfactory.shape.Rectangle;
import com.creational.abstractfactory.shape.Shape;
import com.creational.abstractfactory.shape.Square;

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

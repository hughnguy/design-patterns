package com.creational.abstractfactory.factory;

import com.creational.abstractfactory.shape.RoundedRectangle;
import com.creational.abstractfactory.shape.RoundedSquare;
import com.creational.abstractfactory.shape.Shape;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
        }
        return null;
    }
}

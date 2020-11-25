package com.patterns.creational.abstractfactory.factory;

import com.patterns.creational.abstractfactory.shape.RoundedRectangle;
import com.patterns.creational.abstractfactory.shape.RoundedSquare;
import com.patterns.creational.abstractfactory.shape.Shape;

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

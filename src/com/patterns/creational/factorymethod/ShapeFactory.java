package com.patterns.creational.factorymethod;

import com.patterns.creational.factorymethod.shape.Rectangle;
import com.patterns.creational.factorymethod.shape.Shape;
import com.patterns.creational.factorymethod.shape.Square;
import com.patterns.creational.factorymethod.shape.Circle;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}

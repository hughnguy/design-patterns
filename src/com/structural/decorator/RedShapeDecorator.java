package com.structural.decorator;

import com.structural.decorator.shape.Shape;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedColor(decoratedShape);
    }

    private void setRedColor(Shape decoratedShape){
        System.out.println("Color: Red");
    }
}

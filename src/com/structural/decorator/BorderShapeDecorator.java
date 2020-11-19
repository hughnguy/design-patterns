package com.structural.decorator;

import com.structural.decorator.shape.Shape;

public class BorderShapeDecorator extends ShapeDecorator {

    public BorderShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setBorder(decoratedShape);
    }

    private void setBorder(Shape decoratedShape){
        System.out.println("Border: solid");
    }
}

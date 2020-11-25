package com.patterns.structural.decorator;

import com.patterns.structural.decorator.shape.Shape;

public class SpinningShapeDecorator extends ShapeDecorator {

    public SpinningShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setSpinning(decoratedShape);
    }

    private void setSpinning(Shape decoratedShape){
        System.out.println("Animation: spinning");
    }
}

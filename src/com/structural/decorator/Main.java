package com.structural.decorator;

import com.structural.decorator.shape.Rectangle;
import com.structural.decorator.shape.Shape;

/**
 * Decorator pattern allows a user to add new functionality to an existing object without altering its structure.
 * Also called Wrapper pattern.
 *
 * You can assemble different stacks/layers of decorators at runtime depending on the configuration
 */
public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle();

        boolean enableRed = true;
        boolean enableBorder = true;
        boolean enableSpinning = true;

        if(enableRed) {
            shape = new RedShapeDecorator(shape);
        }
        if(enableBorder) {
            shape = new BorderShapeDecorator(shape);
        }
        if(enableSpinning) {
            shape = new SpinningShapeDecorator(shape);
        }
        shape.draw();
    }
}

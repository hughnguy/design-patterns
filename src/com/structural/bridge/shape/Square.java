package com.structural.bridge.shape;

import com.structural.bridge.color.Color;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }
    @Override
    public String draw() {
        return "Square drawn. " + color.fill();
    }
}

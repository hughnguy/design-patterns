package com.patterns.structural.bridge.shape;

import com.patterns.structural.bridge.color.Color;

public abstract class Shape {
    // Reference to the bridge interface
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public String draw();
}

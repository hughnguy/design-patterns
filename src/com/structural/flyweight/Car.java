package com.structural.flyweight;

public class Car implements Vehicle {
    Engine engine;
    Color color;

    public Car(Engine engine, Color color) {
        this.engine = engine;
        this.color = color;
    }

    @Override
    public void start() {}

    @Override
    public void stop() {}

    // This is extrinsic state which can be controlled by the client
    @Override
    public Color getColor() {
        return color;
    }
}

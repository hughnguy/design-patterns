package com.patterns.creational.prototype.shape;

import com.patterns.creational.prototype.Prototype;

public abstract class Shape implements Prototype, Cloneable {
    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Prototype getClone() {
        Object clone = null;
        try {
            clone = super.clone(); // need to implement cloneable to call this
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Prototype) clone;
    }
}

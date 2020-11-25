package com.patterns.creational.builder.item;

import com.patterns.creational.builder.packing.Packing;

public interface Item {
    public String name();
    public Packing packing();
    public float price();
}

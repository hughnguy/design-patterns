package com.creational.builder.item;

import com.creational.builder.packing.Packing;

public interface Item {
    public String name();
    public Packing packing();
    public float price();
}

package com.patterns.creational.builder.item.burger;

import com.patterns.creational.builder.item.Item;
import com.patterns.creational.builder.packing.Packing;
import com.patterns.creational.builder.packing.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}

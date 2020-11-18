package com.creational.builder.item.burger;

import com.creational.builder.item.Item;
import com.creational.builder.packing.Packing;
import com.creational.builder.packing.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}

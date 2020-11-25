package com.patterns.creational.builder.item.colddrink;

import com.patterns.creational.builder.item.Item;
import com.patterns.creational.builder.packing.Bottle;
import com.patterns.creational.builder.packing.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}

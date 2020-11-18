package com.creational.builder.item.colddrink;

import com.creational.builder.item.Item;
import com.creational.builder.packing.Bottle;
import com.creational.builder.packing.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}

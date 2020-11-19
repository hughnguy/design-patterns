package com.creational.builder.examplewithdirector;

import com.creational.builder.item.Item;
import com.creational.builder.packing.Packing;
import com.creational.builder.packing.Wrapper;

public class Toy implements Item {
    @Override
    public String name() {
        return "Toy";
    }

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public float price() {
        return 0;
    }
}

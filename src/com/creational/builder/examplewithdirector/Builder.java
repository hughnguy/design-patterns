package com.creational.builder.examplewithdirector;

import com.creational.builder.Meal;

public interface Builder {
    void reset();
    void addColdDrink();
    void addBurger();
    void addToy();
    Meal getMeal();
}

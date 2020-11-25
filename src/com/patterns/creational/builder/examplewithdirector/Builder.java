package com.patterns.creational.builder.examplewithdirector;

import com.patterns.creational.builder.Meal;

public interface Builder {
    void reset();
    void addColdDrink();
    void addBurger();
    void addToy();
    Meal getMeal();
}

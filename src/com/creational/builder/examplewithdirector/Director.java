package com.creational.builder.examplewithdirector;

/**
 * Defines the order in which to call construction steps
 */
public class Director {
    public static void make(Builder builder) {
        builder.reset();

        if(builder instanceof HappyMealBuilder) {
            builder.addToy();
        }

        builder.addBurger();
        builder.addColdDrink();
    }
}

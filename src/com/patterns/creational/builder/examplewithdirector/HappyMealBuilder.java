package com.patterns.creational.builder.examplewithdirector;

import com.patterns.creational.builder.Meal;
import com.patterns.creational.builder.item.burger.ChickenBurger;
import com.patterns.creational.builder.item.colddrink.Pepsi;

public class HappyMealBuilder implements Builder {
    Meal meal;

    public HappyMealBuilder() {
        reset();
    }
    @Override
    public void reset() {
        meal = new Meal();
    }

    @Override
    public void addColdDrink() {
        meal.addItem(new Pepsi());
    }

    @Override
    public void addBurger() {
        meal.addItem(new ChickenBurger());
    }
    @Override
    public void addToy() {
        meal.addItem(new Toy());
    }
    @Override
    public Meal getMeal() {
        return meal;
    }
}

package com.creational.builder.examplewithdirector;

import com.creational.builder.Meal;
import com.creational.builder.item.burger.ChickenBurger;
import com.creational.builder.item.colddrink.Pepsi;

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

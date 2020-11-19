package com.creational.builder.examplewithdirector;

import com.creational.builder.Meal;
import com.creational.builder.item.burger.ChickenBurger;
import com.creational.builder.item.burger.VegBurger;
import com.creational.builder.item.colddrink.Coke;

public class VegMealBuilder implements Builder {
    Meal meal;

    public VegMealBuilder() {
        reset();
    }
    @Override
    public void reset() {
        meal = new Meal();
    }

    @Override
    public void addColdDrink() {
        meal.addItem(new Coke());
    }

    @Override
    public void addBurger() {
        meal.addItem(new VegBurger());
    }
    @Override
    public void addToy() {}

    @Override
    public Meal getMeal() {
        return meal;
    }
}

package com.patterns.creational.builder;

import com.patterns.creational.builder.item.burger.ChickenBurger;
import com.patterns.creational.builder.item.burger.VegBurger;
import com.patterns.creational.builder.item.colddrink.Coke;
import com.patterns.creational.builder.item.colddrink.Pepsi;

public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        // adds food
        meal.addItem(new VegBurger());
        // adds drink
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        // adds food
        meal.addItem(new ChickenBurger());
        // adds drink
        meal.addItem(new Pepsi());
        return meal;
    }
}

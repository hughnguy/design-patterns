package com.patterns.creational.builder;

import com.patterns.creational.builder.examplewithdirector.Builder;
import com.patterns.creational.builder.examplewithdirector.Director;
import com.patterns.creational.builder.examplewithdirector.HappyMealBuilder;

public class Main {
    /**
     * Builder pattern lets you construct a complex object (Meal) using simple objects (Item) in a step by step approach.
     * The pattern allows you to produce different types and representations of an object using the same construction code.
     *
     * If a superclass has many possible variations, then instead of creating a considerable number of subclasses or
     * a giant ugly constructor with all possible parameters, you can use this pattern.
     *
     * It uses a builder which is independent of other objects.
     *
     * Affords finer control over the construction process. Unlike creational patterns that construct products in
     * one shot, the Builder pattern constructs the product step by step under the control of the builder.
     *
     * It separates the construction of a complex object from its representation so
     * that the same construction process can create different representations.
     *
     * Example: note that there can be variation in the content of a meal, but the construction process is the same (add food, add drink)
     *
     * Director:
     * You can go further and extract a series of calls to the builder steps you use to construct a product into a separate class called director.
     * The director class defines the order in which to execute the building steps, while the builder provides the implementation for those steps.
     */
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());

        // Directory example
        Builder happyMealBuilder = new HappyMealBuilder();
        System.out.println("\n\nHappy Meal");
        Director.make(happyMealBuilder);
        happyMealBuilder.getMeal().showItems();
        System.out.println("Total Cost: " + happyMealBuilder.getMeal().getCost());

    }
}

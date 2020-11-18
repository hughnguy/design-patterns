package com.creational.builder;

public class Main {
    /**
     * Builder pattern builds a complex object (Meal) using simple objects (Item) in a step by step approach.
     * It uses a builder which is independent of other objects.
     *
     * Affords finer control over the construction process. Unlike creational patterns that construct products in
     * one shot, the Builder pattern constructs the product step by step under the control of the builder.
     *
     * It separates the construction of a complex object from its representation so
     * that the same construction process can create different representations.
     *
     * Example: note that there can be variation in the content of a meal, but the construction process is the same (add food, add drink)
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
    }
}

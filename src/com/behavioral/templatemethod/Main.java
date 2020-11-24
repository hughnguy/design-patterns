package com.behavioral.templatemethod;

/**
 * For Template Method Pattern, the skeleton of the algorithm (template method) is in the superclass but it lets subclasses
 * override specific steps of the algorithm without changing its structure.
 *
 * The template method should not be overridden though and should be marked as final.
 *
 * All subclasses follow the template method defined by the concrete implementation in the abstract class.
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Cricket();
        // Call the template method
        game.play();

        game = new Football();
        // Call the template method
        game.play();
    }
}

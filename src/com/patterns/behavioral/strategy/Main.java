package com.patterns.behavioral.strategy;

/**
 * The strategy pattern allows us to change the behavior of an algorithm at runtime.
 * It suggests that you take a class that does something specific in a lot of different ways
 * and extract all of these algorithms into separate classes called strategies.
 *
 * The original class, called context, must have a field for storing a reference to one of the strategies.
 * The context delegates the work to a linked strategy object instead of executing it on its own.
 *
 * Note: looks similar to Command pattern but strategy is more of how something should be done instead of what should be done.
 *
 * Strategy: (algorithm change: bubblesort, quicksort)
 * Command: (action change: copy, paste)
 *
 * Also might look similar to State pattern. State can be considered an extension of strategy. But the particular states
 * may be aware of each other and initiate transitions from one state to another, whereas in Strategy pattern,
 * strategies almost never know about each other
 *
 * - Use the pattern when your class has a massive conditional operator that switches between different variants of the same algorithm.
 * - Use the Strategy pattern when you want to use different variants of an algorithm within an object
 * and be able to switch from one algorithm to another during runtime.
 * - Use the Strategy when you have a lot of similar classes that only differ in the way they execute some behavior.
 * - Use the pattern to isolate the business logic of a class from the implementation details of algorithms that may
 * not be as important in the context of that logic.
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context.setStrategy(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context.setStrategy(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}

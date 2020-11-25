package com.patterns.behavioral.state;

/**
 * State design pattern is used when an Object changes its behavior based on its internal state.
 *
 * The State pattern suggests that you create new classes for all possible states of an object and
 * extract all state-specific behaviors into these classes. This reduces massive if/else and conditionals that
 * can be seen in state machine implementations.
 *
 * With State pattern, the benefits of implementing polymorphic behavior are evident,
 * and it is also easier to add states to support additional behavior.
 *
 * Note: in the State pattern, the particular states may be aware of each other and initiate
 * transitions from one state to another, whereas in Strategy pattern, strategies almost never know about each other.
 *
 * - Use the State pattern when you have an object that behaves differently depending on its current state,
 * the number of states is enormous, and the state-specific code changes frequently.
 * - Use the pattern when you have a class polluted with massive conditionals that alter how the class behaves
 * according to the current values of the class’s fields.
 */
public class Main {
    public static void main(String[] args) {
        Package pkg = new Package();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.previousState();
        pkg.printStatus();
    }
}

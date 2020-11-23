package com.behavioral.mediator;

/**
 * The Mediator Pattern reduces the complexity and dependencies
 * between tightly coupled objects communicating directly with one another.
 * This is achieved by creating a mediator object that takes care of the interaction between dependent objects.
 * Consequently, all the communication goes through the mediator.
 *
 * Example: Pilots of aircraft that approach or depart the airport control area don’t communicate directly with each other.
 * Instead, they speak to an air traffic controller, who sits in a tall tower somewhere near the airstrip.
 * Without the air traffic controller, pilots would need to be aware of every plane in the vicinity of the airport,
 * discussing landing priorities with a committee of dozens of other pilots. That would probably skyrocket the airplane crash statistics.
 */
public class Main {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");
        User hugh = new User("Hugh");

        // The static chat room acts as mediator to send messages
        // instead of having all the users need to know about each other
        robert.sendMessage("What's up folks!!");
        hugh.sendMessage("Not much!!");
    }
}

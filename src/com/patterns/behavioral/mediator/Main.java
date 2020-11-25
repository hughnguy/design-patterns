package com.patterns.behavioral.mediator;

/**
 * The Mediator Pattern reduces the complexity and dependencies
 * between tightly coupled objects communicating directly with one another.
 * This is achieved by creating a mediator object that takes care of the interaction between dependent objects.
 * Consequently, all the communication goes through the mediator.
 *
 * Mediator pattern simply defines an object that encapsulates how a set of objects interact
 * and their relationships.
 *
 * Example: Pilots of aircraft that approach or depart the airport control area don’t communicate directly with each other.
 * Instead, they speak to an air traffic controller, who sits in a tall tower somewhere near the airstrip.
 * Without the air traffic controller, pilots would need to be aware of every plane in the vicinity of the airport,
 * discussing landing priorities with a committee of dozens of other pilots. That would probably skyrocket the airplane crash statistics.
 */
public class Main {
    public static void main(String[] args) {
        ATCMediator atcMediator = new ATCMediator();

        Flight sparrow101 = new Flight(atcMediator);
        Runway mainRunway = new Runway(atcMediator);

        atcMediator.registerFlight(sparrow101);
        atcMediator.registerRunway(mainRunway);

        sparrow101.getReady();

        mainRunway.land();
        sparrow101.land();
    }
}

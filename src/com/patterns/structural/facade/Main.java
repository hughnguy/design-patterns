package com.patterns.structural.facade;

/**
 * Facade encapsulates a complex subsystem behind a simple interface.
 * It hides much of the complexity and makes the subsystem easy to use.
 *
 * A facade might provide limited functionality in comparison to working with the subsystem directly.
 * However, it includes only those features that clients really care about.
 *
 * It also decouples a client implementation from the complex subsystem.
 * Thanks to this, we can make changes to the existing subsystem and don't affect a client.
 * Client still calls startEngine() and stopEngine() without needing to know about the internals
 *
 * - Use the Facade pattern when you need to have a limited but straightforward interface to a complex subsystem
 * - You can reduce coupling between multiple subsystems by requiring them to communicate only through facades.
 * - A facade can be achieved via java interfaces but this is not necessary as seen in the example below. Facades simply hide complexity
 *
 */
public class Main {
    public static void main(String[] args) {
        CarEngineFacade facade = new CarEngineFacade();
        facade.startEngine();
        facade.stopEngine();
    }
}

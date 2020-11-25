package com.patterns.behavioral.chainofresponsibility;

/**
 * Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers.
 * Upon receiving a request, each handler decides either to process the request and terminate the chain
 * or to pass it to the next handler in the chain.
 *
 * The chain-of-responsibility pattern is structurally nearly identical to the decorator pattern,
 * the difference being that for the decorator, all classes handle the request, while for the chain of responsibility,
 * exactly one of the classes in the chain handles the request.
 * ex:
 * - Only one of the classes in the chain will call handleRequest() if it matches the criteria and
 * the chain can be killed at any point or continue.
 * - Whereas in decorator, all layers do processing
 */
public class Main {
    public static void main(String[] args) {
        Chain chain = new Chain();

        //Calling chain of responsibility (only 1 of the handlers will process the request)
        chain.process(new Number(90));
        chain.process(new Number(-50));
        chain.process(new Number(0));
        chain.process(new Number(91));
    }
}

package com.patterns.structural.proxy;

/**
 * The Proxy pattern allows us to create an intermediary that acts as an interface to another resource.
 * It controls and manages access to the object they are protecting
 *
 * The Proxy pattern suggests that you create a new proxy class with the same interface as an original service object.
 * Then you update your app so that it passes the proxy object to all of the original object’s clients.
 * Upon receiving a request from a client, the proxy creates a real service object and delegates all the work to it.
 *
 * Example:
 * - You can have a proxy disguise itself as a database object. It can handle lazy initialization
 * and result caching without the client or the real database object even knowing.
 *
 * - A credit card is a proxy for a bank account, which is a proxy for cash. Both implement the same interface:
 * they can be used for making a payment. A consumer feels great because there’s no need to carry loads of cash around.
 * A shop owner is also happy since the income from a transaction gets added electronically to the shop’s bank account
 * without the risk of losing the deposit or getting robbed on the way to the bank.
 *
 * Use a proxy when:
 * - We want to add a layer of security to the original underlying object to provide controlled access
 * based on access rights of the client. This is called Protection Proxy
 * - We want a simplified version of a complex or heavy object (massive object that consumes vast amount of resources).
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Note that we're calling the process() method twice.
         * Behind the scenes, the expensive operation part will occur when the process() function first gets called.
         * Subsequent calls will skip this part.
         */
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();

        // Process sets values but DB request is not sent until calling update()
        object.setSomeField("test");
        object.setAnotherField("test2");
        object.update();
    }
}

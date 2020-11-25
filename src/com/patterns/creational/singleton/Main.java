package com.patterns.creational.singleton;

/**
 * Lets you ensure that a class has only one instance, while providing a global access point to this instance.
 *
 * - Examples: control access to some shared resource, database or a file
 *
 * - Make the default constructor private, to prevent other objects from using the new operator with the Singleton class.
 * - Create a static creation method that acts as a constructor. This method calls the private constructor to create
 *  an object and saves it in a static field. All following calls to this method return the cached object.
 * - The singleton object is initialized only when it’s requested for the first time.
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }
}

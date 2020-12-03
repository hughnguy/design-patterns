package com.refactoring.organizingdata;

public class ReplaceDataValueWithObject {

    /////// Problem ///////

    /**
     * A class (or group of classes) contains a data field. The field has its own behavior and associated data.
     */
    class Order {
        String customer;
    }

    /////// Solution ///////

    /**
     * Create a new class, place the old field and its behavior in the class, and store the object of the class in the original class.
     */
    class Order2 {
        Customer customer;
    }

    class Customer {
        String name;
    }

    /////////////////////
}

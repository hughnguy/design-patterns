package com.refactoring.organizingdata;

public class ChangeBidirectionalToUnidirectional {

    /////// Problem ///////

    /**
     * You have a bidirectional association between classes, but one of the classes doesn’t use the other’s features.
     */
    class Customer {
        String name;
        Order order;

        String getOrderId() {
            return order.getId();
        }
        String getName() {
            return name;
        }
    }

    class Order {
        Customer customer; // not used
        String id;

        String getId() {
            return id;
        }
    }


    /////// Solution ///////

    /**
     * Remove the unused association.
     *
     * A bidirectional association is generally harder to maintain than a unidirectional one,
     * requiring additional code for properly creating and deleting the relevant objects.
     * This makes the program more complicated.
     */
    class Order2 {
        String id;

        String getId() {
            return id;
        }
    }

    /////////////////////
}

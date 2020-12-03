package com.refactoring.organizingdata;

public class ChangeUnidirectionalAssociationToBidirectional {

    /////// Problem ///////

    /**
     * You have two classes that each need to use the features of the other, but the
     * association between them is only unidirectional.
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
        String id;

        String getCustomerName() {
            return "????????????????";
        }

        String getId() {
            return id;
        }
    }


    /////// Solution ///////

    /**
     * Add the missing association to the class that needs it.
     *
     *  Drawback: Bidirectional associations are much harder to implement and maintain than unidirectional ones.
     */
    class Order2 {
        Customer customer;
        String id;

        String getCustomerName() {
            return customer.getName();
        }
        String getId() {
            return id;
        }
    }

    /////////////////////
}

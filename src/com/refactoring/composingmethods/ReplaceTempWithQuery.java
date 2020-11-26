package com.refactoring.composingmethods;

public class ReplaceTempWithQuery {

    double quantity;
    double itemPrice;

    /////// Problem ///////

    /**
     * You place the result of an expression in a local variable for later use in your code.
     */
    double calculateTotalV1() {
        double basePrice = quantity * itemPrice;
        if (basePrice > 1000) {
            return basePrice * 0.95;
        } else {
            return basePrice * 0.98;
        }
    }

    /////// Solution ///////

    /**
     * Move the entire expression to a separate method and return the result from it.
     * Query the method instead of using a variable. Incorporate the new method in other methods, if necessary.
     *
     * Only do this if there is no performance hit
     */
    double calculateTotalV2() {
        if(basePrice() > 1000) {
            return basePrice() * 0.95;
        } else {
            return basePrice() * 0.98;
        }
    }

    double basePrice() {
        return quantity * itemPrice;
    }

    /////////////////////
}

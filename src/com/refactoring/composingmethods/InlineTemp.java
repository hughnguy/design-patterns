package com.refactoring.composingmethods;

public class InlineTemp {
    Order order;

    private class Order {
        double basePrice() {
            return 0;
        }
    }

    /////// Problem ///////

    /**
     * You have a temporary variable that’s assigned the result of a simple expression and nothing more.
     */
    boolean hasDiscountV1() {
        double basePrice = order.basePrice();
        return basePrice > 1000;
    }

    /////// Solution ///////

    /**
     * Replace the references to the variable with the expression itself.
     */
    boolean hasDiscountV2() {
        return order.basePrice() > 1000;
    }

    /////////////////////
}

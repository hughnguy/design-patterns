package com.refactoring.composingmethods;

public class InlineMethod {
    int numberOfLateDeliveries;

    /////// Problem ///////

    /**
     * When a method body is more obvious than the method itself, use this technique.
     */
    int getRatingV1() {
        return moreThanFiveLateDeliveries() ? 2 : 1;
    }

    boolean moreThanFiveLateDeliveries() {
        return numberOfLateDeliveries > 5;
    }

    /////// Solution ///////

    /**
     * Replace calls to the method with the method’s content and delete the method itself.
     */
    int getRatingV2() {
        return numberOfLateDeliveries > 5 ? 2 : 1;
    }
}

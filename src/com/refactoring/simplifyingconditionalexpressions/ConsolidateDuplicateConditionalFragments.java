package com.refactoring.simplifyingconditionalexpressions;

public class ConsolidateDuplicateConditionalFragments {
    double total;
    double price;

    /////// Problem ///////

    /**
     * Identical code can be found in all branches of a conditional.
     */
    void testV1() {
        if (isSpecialDeal()) {
            total = price * 0.95;
            send();
        }
        else {
            total = price * 0.98;
            send();
        }
    }

    /////// Solution ///////

    /**
     * Move the code outside of the conditional.
     */
    void testV2() {
        if (isSpecialDeal()) {
            total = price * 0.95;
        }
        else {
            total = price * 0.98;
        }
        send();
    }

    /////////////////////

    boolean isSpecialDeal() {return true;};
    void send() {}
}

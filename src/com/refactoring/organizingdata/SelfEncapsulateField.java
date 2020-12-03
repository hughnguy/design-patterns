package com.refactoring.organizingdata;

import com.refactoring.dealingwithgeneralization.ReplaceDelegationWithInheritance;

public class SelfEncapsulateField {

    /////// Problem ///////

    /**
     * You use direct access to private fields inside a class.
     */
    class Range {
        private int low, high;
        boolean includes(int arg) {
            return arg >= low && arg <= high;
        }
    }

    /////// Solution ///////

    /**
     * Create a getter and setter for the field, and use only them for accessing the field.
     *
     * Gives more flexibility. You can perform complex operations when data in the field is set or received.
     * Lazy initialization and validation of field values are easily implemented inside field getters and setters.
     * More crucially, you can redefine getters and setters in subclasses.
     */
    class Range2 {
        private int low, high;
        boolean includes(int arg) {
            return arg >= getLow() && arg <= getHigh();
        }
        int getLow() {
            return low;
        }
        int getHigh() {
            return high;
        }
    }

    /////////////////////

}

package com.refactoring.composingmethods;

public class RemoveAssignmentsToParameters {

    /////// Problem ///////

    /**
     * Some value is assigned to a parameter inside method’s body.
     */
    int discountV1(int inputVal, int quantity) {
        if(quantity > 50) {
            inputVal -= 2; // should not re-assign to parameter passed in. causes issue if passed via reference instead of value
        }
        return inputVal;
    }

    /////// Solution ///////

    /**
     * Use a local variable instead of a parameter.
     */
    int discountV2(int inputVal, int quantity) {
        int result = inputVal;
        if (quantity > 50) {
            result -= 2;
        }
        return result;
    }

    /////////////////////
}

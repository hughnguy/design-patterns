package com.refactoring.simplifyingmethodcalls;

import java.util.Date;

public class SeparateQueryFromModifier {

    /////// Problem ///////

    /**
     * Do you have a method that returns a value but also changes something inside an object?
     */
    double getTotalOutstandingAndSetReadyForSummaries() {
        return 0;
    }

    /////// Solution ///////

    /**
     * Split the method into two separate methods. As you would expect,
     * one of them should return the value and the other one modifies the object.
     */
    double getTotalOutstanding() {
        return 0; // query
    }
    void setReadyForSummaries() {
        // modifier
    }

    /////////////////////
}

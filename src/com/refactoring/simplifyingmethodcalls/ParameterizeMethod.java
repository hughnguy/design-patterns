package com.refactoring.simplifyingmethodcalls;

public class ParameterizeMethod {

    /////// Problem ///////

    /**
     * Multiple methods perform similar actions that are different only in their internal values, numbers or operations.
     */
    void fivePercentRaise() {
        // do something
    }
    void tenPercentRaise() {
        // do something
    }

    /////// Solution ///////

    /**
     * Combine these methods by using a parameter that will pass the necessary special value.
     */
    void raise(double percentage) {
        // do something
    }

    /////////////////////
}

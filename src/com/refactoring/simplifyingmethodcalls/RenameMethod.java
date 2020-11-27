package com.refactoring.simplifyingmethodcalls;

public class RenameMethod {

    /////// Problem ///////

    /**
     * The name of a method doesn’t explain what the method does.
     */
    String getNsm() {
        return "smith";
    }

    /////// Solution ///////

    /**
     * Rename the method.
     */
    String getSecondName() {
        return "smith";
    }

    /////////////////////
}

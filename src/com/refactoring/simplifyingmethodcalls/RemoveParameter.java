package com.refactoring.simplifyingmethodcalls;

import java.util.Date;

public class RemoveParameter {

    /////// Problem ///////

    /**
     * A parameter isn’t used in the body of a method.
     */
    String getContact(Date date) {
        return "smith";
    }

    /////// Solution ///////

    /**
     * Remove the unused parameter.
     */
    String getContact() {
        return "smith";
    }

    /////////////////////
}

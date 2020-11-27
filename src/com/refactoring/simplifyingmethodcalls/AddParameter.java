package com.refactoring.simplifyingmethodcalls;

import java.util.Date;

public class AddParameter {

    /////// Problem ///////

    /**
     * A method doesn’t have enough data to perform certain actions.
     */
    String getContact() {
        return "smith";
    }

    /////// Solution ///////

    /**
     * Create a new parameter to pass the necessary data.
     */
    String getContact(Date date) {
        return "smith" + date.toString();
    }

    /////////////////////
}

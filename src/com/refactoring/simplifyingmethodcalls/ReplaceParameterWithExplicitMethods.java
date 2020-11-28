package com.refactoring.simplifyingmethodcalls;

public class ReplaceParameterWithExplicitMethods {
    int height;
    int width;

    /////// Problem ///////

    /**
     * A method is split into parts, each of which is run depending on the value of a parameter.
     */
    void setValue(String name, int value) {
        if (name.equals("height")) {
            height = value;
            return;
        }
        if (name.equals("width")) {
            width = value;
            return;
        }
    }

    /////// Solution ///////

    /**
     * Extract the individual parts of the method into their own methods and call them instead of the original method.
     */
    void setHeight(int arg) {
        height = arg;
    }
    void setWidth(int arg) {
        width = arg;
    }

    /////////////////////
}

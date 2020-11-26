package com.refactoring.movingfeaturesbetweenobjects;

public class ExtractClass {

    /////// Problem ///////

    /**
     * When one class does the work of two, awkwardness results.
     */

    private class Person {
        String name;
        String officeAreaCode;
        String officeNumber;

        String getTelephoneNumber() {
            return officeAreaCode + officeNumber;
        }
    }

    /////// Solution ///////

    /**
     * Instead, create a new class and place the fields and methods responsible for the relevant functionality in it.
     */

    private class Person2 {
        String name;
        TelephoneNumber telephoneNumber;
    }

    private class TelephoneNumber {
        String officeAreaCode;
        String officeNumber;

        String getTelephoneNumber() {
            return officeAreaCode + officeNumber;
        }
    }

    /////////////////////
}

package com.refactoring.movingfeaturesbetweenobjects;

public class InlineClass {

    /////// Problem ///////

    /**
     * A class does almost nothing and isn’t responsible for anything, and no additional responsibilities are planned for it.
     */

    private class Person {
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

    /////// Solution ///////

    /**
     * Move all features from the class to another one.
     */

    private class TelephoneNumber2 {
        String ownerName;
        String officeAreaCode;
        String officeNumber;

        String getTelephoneNumber() {
            return officeAreaCode + officeNumber;
        }

        String getOwnerName() {
            return ownerName;
        }
    }

    /////////////////////
}

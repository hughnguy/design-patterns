package com.refactoring.simplifyingmethodcalls;

import java.util.Date;

public class RemoveSettingMethod {

    /////// Problem ///////

    /**
     * The value of a field should be set only when it’s created, and not change at any time after that.
     */
    class Person {
        private int sinNumber; // value should be immutable and never change

        Person(int sinNumber) {
            this.sinNumber = sinNumber;
        }

        void setSinNumber(int sinNumber) {
            this.sinNumber = sinNumber;
        }
    }

    /////// Solution ///////

    /**
     * So remove methods that set the field’s value.
     */
    class Person2 {
        private int sinNumber;

        Person2(int sinNumber) {
            this.sinNumber = sinNumber;
        }
    }

    /////////////////////
}

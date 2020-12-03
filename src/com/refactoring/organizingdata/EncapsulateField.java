package com.refactoring.organizingdata;

public class EncapsulateField {

    /////// Problem ///////

    /**
     * You have a public field.
     */
    class Person {
        public String name;
    }

    /////// Solution ///////

    /**
     * Make the field private and create access methods for it.
     */
    class Person2 {
        private String name;

        public String getName() {
            return name;
        }
        public void setName(String arg) {
            name = arg;
        }
    }

    /////////////////////

}

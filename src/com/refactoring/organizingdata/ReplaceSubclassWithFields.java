package com.refactoring.organizingdata;

public class ReplaceSubclassWithFields {

    /////// Problem ///////

    /**
     * You have subclasses differing only in their (constant-returning) methods.
     */
    abstract class Person {
        abstract String getCode();
    }

    class Male extends Person {
        @Override
        String getCode() {
            return "M";
        }
    }

    class Female extends Person {
        @Override
        String getCode() {
            return "F";
        }
    }

    /////// Solution ///////

    /**
     * Replace the methods with fields in the parent class and delete the subclasses.
     *
     * Simplifies system architecture. Creating subclasses is overkill if all you want to do is to
     * return different values in different methods.
     */
    static class NewPerson {
        String code;
        NewPerson(String code) {
            this.code = code;
        }
        String getCode() {
            return code;
        }
        public static NewPerson createMale() {
            return new NewPerson("M");
        }
        public static NewPerson createFemale() {
            return new NewPerson("F");
        }
    }


    /////////////////////
}

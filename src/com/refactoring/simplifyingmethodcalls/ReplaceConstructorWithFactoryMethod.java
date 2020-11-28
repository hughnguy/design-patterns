package com.refactoring.simplifyingmethodcalls;

public class ReplaceConstructorWithFactoryMethod {

    /////// Problem ///////

    /**
     * You have a complex constructor that does something more than just setting parameter values in object fields.
     */
    class Employee {
        int type;

        Employee(int type) {
            this.type = type;
            // do some complex stuff
        }
    }

    /////// Solution ///////

    /**
     * Create a factory method and use it to replace constructor calls.
     */
    static class Employee2 {
        int type;
        static Employee2 employee;

        private Employee2(int type) {
            this.type = type;
        }

        public static Employee2 create(int type) {
            employee = new Employee2(type);
            // do some heavy lifting.
            return employee;
        }
    }

    /////////////////////
}

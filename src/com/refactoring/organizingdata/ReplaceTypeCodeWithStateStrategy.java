package com.refactoring.organizingdata;

public class ReplaceTypeCodeWithStateStrategy {

    /////// Problem ///////

    /**
     * You have a coded type that affects behavior but you can’t use subclasses to get rid of it.
     */

    final class Employee { // final class so cannot extend
        // These are type code
        public static final int ENGINEER = 0;
        public static final int SALESMAN = 1;

        private int type;

        Employee(int type) {
            this.type = type;
        }

        void talk() {
            if(this.type == ENGINEER) {
                System.out.println("Im an engineer");
            } else if(this.type == SALESMAN) {
                System.out.println("Im a salesman");
            }
        }
    }

    /////// Solution ///////

    /**
     * Replace type code with a state object. If it’s necessary to replace a field value with type code,
     * another state object is “plugged in”.
     */
    final class Employee2 { // final class so cannot extend
        EmployeeType employeeType; // state object of this current class

        Employee2(EmployeeType employeeType) {
            this.employeeType = employeeType;
        }

        void talk() {
            employeeType.talk();
        }
    }

    abstract class EmployeeType { // state object
        abstract void talk();
    }

    class Engineer extends EmployeeType {
        @Override
        void talk() {
            System.out.println("Im an engineer");
        }
    }

    class Salesman extends EmployeeType {
        @Override
        void talk() {
            System.out.println("Im a salesman");
        }
    }

    /////////////////////
}

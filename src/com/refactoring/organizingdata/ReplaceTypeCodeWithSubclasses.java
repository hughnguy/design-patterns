package com.refactoring.organizingdata;

public class ReplaceTypeCodeWithSubclasses {

    /////// Problem ///////

    /**
     * You have a coded type that directly affects program behavior (values of this field trigger various code in conditionals).
     */

    class Employee {
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
     * Create subclasses for each value of the coded type. Then extract the relevant behaviors from the original
     * class to these subclasses. Replace the control flow code with polymorphism.
     */

    abstract class Employee2 {
        abstract void talk();
    }

    class Engineer extends Employee2 {
        @Override
        void talk() {
            System.out.println("Im an engineer");
        }
    }

    class Salesman extends Employee2 {
        @Override
        void talk() {
            System.out.println("Im a salesman");
        }
    }

    /////////////////////
}

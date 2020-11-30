package com.refactoring.dealingwithgeneralization;

public class PullUpConstructorBody {

    class Employee {
        String name;
        String id;
        public Employee() {}
        public Employee(String name, String id) {
            this.name = name;
            this.id = id;
        }
    }

    /////// Problem ///////

    /**
     * Your subclasses have constructors with code that’s mostly identical.
     */
    class Manager extends Employee {
        int grade;

        public Manager(String name, String id, int grade) {
            this.name = name;
            this.id = id;
            this.grade = grade;
        }
    }

    /////// Solution ///////

    /**
     * Create a superclass constructor and move the code that’s the same in the subclasses to it.
     * Call the superclass constructor in the subclass constructors.
     */
    class Manager2 extends Employee {
        int grade;

        public Manager2(String name, String id, int grade) {
            super(name, id);
            this.grade = grade;
        }
    }

    /////////////////////
}

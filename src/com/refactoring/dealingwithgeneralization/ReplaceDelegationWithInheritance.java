package com.refactoring.dealingwithgeneralization;

public class ReplaceDelegationWithInheritance {

    /////// Problem ///////

    /**
     * A class contains many simple methods that delegate to all methods of another class.
     */
    class Employee {
        Person person;

        String getName() {
            return person.getName();
        }
        int getAge() {
            return person.getAge();
        }
    }

    class Person {
        String getName() {
            return null;
        }
        int getAge() {
            return 0;
        }
    }

    /////// Solution ///////

    /**
     * Make the class a delegate inheritor, which makes the delegating methods unnecessary.
     */
    abstract class Employee2 {
        abstract String getName();
        abstract int getAge();
    }

    class Person2 extends Employee2 {
        @Override
        String getName() {
            return null;
        }
        @Override
        int getAge() {
            return 0;
        }
    }

    /////////////////////
}

package com.refactoring.movingfeaturesbetweenobjects;

public class HideDelegate {

    /////// Problem ///////

    /**
     * The client gets object B from a field or method of object А. Then the client calls a method of object B.
     */

    private class Client {
        void test() {
            Person person = new Person();
            Department department = person.getDepartment(); // the client now needs to know about the department
            Person manager = department.getManager();
        }
    }

    /////// Solution ///////

    /**
     * Create a new method in class A that delegates the call to object B.
     * Now the client doesn’t know about, or depend on, class B.
     */

    private class Client2 {
        void test() {
            Person person = new Person();
            Person manager = person.getDepartmentManager();
        }
    }

    /////////////////////

    private class Person {
        Department department;

        Department getDepartment() {
            return department;
        }

        Person getDepartmentManager() {
            return department.getManager();
        }
    }

    private class Department {
        Person manager;
        Person getManager() {
            return manager;
        }
    }
}

package com.refactoring.movingfeaturesbetweenobjects;

public class RemoveMiddleMan {

    /////// Problem ///////

    /**
     * A class has too many methods that simply delegate to other objects.
     */

    private class Client {
        void test() {
            Person person = new Person();
            Person manager = person.getDepartmentManager();
            Person boss = person.getDepartmentBoss();
            Person valet = person.getDepartmentValet();
            Person secretary = person.getDepartmentSecretary();
        }
    }

    /////// Solution ///////

    /**
     * Delete these methods and force the client to call the end methods directly.
     */

    private class Client2 {
        void test() {
            Person person = new Person();
            Department department = person.getDepartment();

            Person manager = department.getManager();
            Person boss = department.getBoss();
            Person valet = department.getValet();
            Person secretary = department.getSecretary();
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

        Person getDepartmentBoss() {
            return department.getBoss();
        }

        Person getDepartmentValet() {
            return department.getValet();
        }

        Person getDepartmentSecretary() {
            return department.getSecretary();
        }
    }

    private class Department {
        Person manager;
        Person boss;
        Person valet;
        Person secretary;

        Person getManager() {
            return manager;
        }

        Person getBoss() {
            return boss;
        }

        Person getValet() {
            return valet;
        }

        Person getSecretary() {
            return secretary;
        }
    }
}

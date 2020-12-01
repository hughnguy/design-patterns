package com.refactoring.dealingwithgeneralization;

public class CollapseHierarchy {

    /////// Problem ///////

    /**
     * Multiple clients are using the same part of a class interface. Another case: part of the interface in two classes is the same.
     */
    class Employee {
        String getName() {
            return null;
        }
    }

    class SalesMan extends Employee {
        int getAge() {
            return 0;
        }
    }

    /////// Solution ///////

    /**
     * Merge the subclass and superclass.
     */
    class Employee2 {
        String getName() {
            return null;
        }
        int getAge() {
            return 0;
        }
    }

    /////////////////////
}

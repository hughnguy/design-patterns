package com.refactoring.dealingwithgeneralization;

public class ExtractSuperclass {

    /////// Problem ///////

    /**
     * You have two classes with common fields and methods.
     */
    abstract class Department {
        abstract int getTotalAnnualCost();
        abstract String getName();
        abstract int getHeadCount();
    }

    abstract class Employee {
        abstract int getAnnualCost();
        abstract String getName();
        abstract int getId();
    }

    /////// Solution ///////

    /**
     * Create a shared superclass for them and move all the identical fields and methods to it.
     */
    abstract class Party {
        abstract int getTotalAnnualCost();
        abstract String getName();
    }

    class Department2 extends Party {
        int getHeadCount() {
            return 0;
        }

        @Override
        int getTotalAnnualCost() {
            return 0;
        }

        @Override
        String getName() {
            return null;
        }
    }

    class Employee2 extends Party {
        int getId() {
            return 0;
        }

        @Override
        int getTotalAnnualCost() {
            return 0;
        }

        @Override
        String getName() {
            return null;
        }
    }

    /////////////////////
}

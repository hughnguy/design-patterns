package com.refactoring.dealingwithgeneralization;

public class ExtractSubclass {

    /////// Problem ///////

    /**
     * A class has features that are used only in certain cases.
     */
    abstract class JobItem {
        abstract int getTotalPrice();
        abstract int getLaborUnitPrice();
        abstract int getLaborEmployee();
    }

    /////// Solution ///////

    /**
     * Create a subclass and use it in these cases.
     */
    abstract class JobItem2 {
        abstract int getTotalPrice();
    }

    abstract class LaborItem extends JobItem2 {
        abstract int getLaborUnitPrice();
        abstract int getLaborEmployee();
    }

    /////////////////////
}

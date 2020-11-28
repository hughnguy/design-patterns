package com.refactoring.simplifyingmethodcalls;

public class PreserveWholeObject {
    Range daysTempRange;
    Plan plan;

    class Range {
        int getLow() {return 0;}
        int getHigh() {return 0;}
    }

    class Plan {
        boolean withinRange(int low, int high) { return true;}
        boolean withinRange(Range daysTempRange) { return true;}
    }

    /////// Problem ///////

    /**
     * You get several values from an object and then pass them as parameters to a method.
     */
    void testV1() {
        int low = daysTempRange.getLow();
        int high = daysTempRange.getHigh();
        boolean withinPlan = plan.withinRange(low, high);
    }

    /////// Solution ///////

    /**
     * Instead, try passing the whole object.
     */
    void testV2() {
        boolean withinPlan = plan.withinRange(daysTempRange);
    }

    /////////////////////
}

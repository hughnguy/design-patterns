package com.refactoring.simplifyingmethodcalls;

public class ReplaceExceptionWithTest {
    int[] values;

    /////// Problem ///////

    /**
     * You throw an exception in a place where a simple test would do the job?
     */
    double getValueForPeriod(int periodNumber) {
        try {
            return values[periodNumber];
        } catch (ArrayIndexOutOfBoundsException e) {
            return 0;
        }
    }

    /////// Solution ///////

    /**
     * Replace the exception with a condition test/check.
     */
    double getValueForPeriodV2(int periodNumber) {
        if (periodNumber >= values.length) {
            return 0;
        }
        return values[periodNumber];
    }

    /////////////////////
}

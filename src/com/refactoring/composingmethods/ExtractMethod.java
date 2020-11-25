package com.refactoring.composingmethods;

import java.text.BreakIterator;

public class ExtractMethod {
    String name;

    /////// Problem ///////

    /**
     * You have a code fragment that can be grouped together.
     */
    void printOwingV1() {
        printBanner();

        // Print details.
        System.out.println("name: " + name);
        System.out.println("amount: " + getOutstanding());
    }

    /////// Solution ///////

    /**
     * Move this code to a separate new method (or function) and
     * replace the old code with a call to the method.
     */
    void printOwingV2() {
        printBanner();
        printDetails(getOutstanding());
    }

    void printDetails(double outstanding) {
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }

    /////////////////////

    void printBanner() {}
    int getOutstanding() {
        return 0;
    }
}

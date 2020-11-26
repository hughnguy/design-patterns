package com.refactoring.composingmethods;

public class SplitTemporaryVariable {

    double height;
    double width;

    /////// Problem ///////

    /**
     * You have a local variable that’s used to store various intermediate values inside a method (except for cycle variables).
     */
    void testV1() {
        double temp = 2 * (height + width);
        System.out.println(temp);

        temp = height * width; // re-assigned new value here
        System.out.println(temp);
    }

    /////// Solution ///////

    /**
     * Use different variables for different values. Each variable should be responsible for only one particular thing.
     */
    void testV2() {
        final double perimeter = 2 * (height + width);
        System.out.println(perimeter);

        final double area = height * width;
        System.out.println(area);
    }

    /////////////////////
}

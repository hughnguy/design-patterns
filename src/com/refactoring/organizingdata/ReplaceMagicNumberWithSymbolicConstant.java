package com.refactoring.organizingdata;

public class ReplaceMagicNumberWithSymbolicConstant {

    /////// Problem ///////

    /**
     * Your code uses a number that has a certain meaning to it.
     */
    double potentialEnergy(double mass, double height) {
        return mass * height * 9.81;
    }

    /////// Solution ///////

    /**
     * Replace this number with a constant that has a human-readable name explaining the meaning of the number.
     */
    static final double GRAVITATIONAL_CONSTANT = 9.81;

    double potentialEnergyV2(double mass, double height) {
        return mass * height * GRAVITATIONAL_CONSTANT;
    }

    /////////////////////
}

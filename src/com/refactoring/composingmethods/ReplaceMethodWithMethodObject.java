package com.refactoring.composingmethods;

public class ReplaceMethodWithMethodObject {

    /////// Problem ///////

    /**
     * You have a long method in which the local variables are so intertwined that you can’t apply Extract Method.
     */
    double priceV1() {
        double primaryBasePrice;
        double secondaryBasePrice;
        double tertiaryBasePrice;

        // Perform long computation.
        return 0;
    }

    /////// Solution ///////

    /**
     * Transform the method into a separate class so that the local variables become fields of the class.
     * Then you can split the method into several methods within the same class.
     */
    double priceV2(int inputVal, int quantity) {
        return new PriceCalculator(this).compute();
    }

    private class PriceCalculator {
        private double primaryBasePrice;
        private double secondaryBasePrice;
        private double tertiaryBasePrice;

        public PriceCalculator(ReplaceMethodWithMethodObject order) {
            // Copy relevant information from the
            // order object.
        }

        public double compute() {
            // Perform long computation.
            doSomething();
            doSomethingElse();
            return 0;
        }

        // Can be broke into smaller submethods which do not pollute the original class
        private void doSomething() {}
        private void doSomethingElse() {}
    }

    /////////////////////
}

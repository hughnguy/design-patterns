package com.refactoring.simplifyingmethodcalls;

public class ReplaceParameterWithMethodCall {
    int quantity;
    int itemPrice;

    double getSeasonalDiscount() {return 0;}
    double discountedPrice(double basePrice, double seasonDiscount, double fees) {return 0;}
    double getFees() {return 0;}

    /////// Problem ///////

    /**
     * Calling a query method and passing its results as the parameters of another method,
     * while that method could call the query directly.
     */
    void testV1() {
        int basePrice = quantity * itemPrice;
        double seasonDiscount = this.getSeasonalDiscount();
        double fees = this.getFees();
        double finalPrice = discountedPrice(basePrice, seasonDiscount, fees);
    }

    /////// Solution ///////

    /**
     * Instead of passing the value through a parameter, try placing a query call inside the method body.
     */
    void testV2() {
        int basePrice = quantity * itemPrice;
        // discounted price can instead call getSeasonalDiscount() and getFees()
        double finalPrice = discountedPriceV2(basePrice);
    }

    double discountedPriceV2(double base) {
        double seasonDiscount = this.getSeasonalDiscount();
        double fees = this.getFees();
        return 0;
    }

    /////////////////////
}

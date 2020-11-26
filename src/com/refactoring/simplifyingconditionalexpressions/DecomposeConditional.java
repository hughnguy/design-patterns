package com.refactoring.simplifyingconditionalexpressions;

import com.refactoring.movingfeaturesbetweenobjects.IntroduceLocalExtension;

import java.util.Date;

public class DecomposeConditional {
    Date date;
    Date SUMMER_START;
    Date SUMMER_END;
    double charge;
    double winterRate;
    double summerRate;
    double winterServiceCharge;
    double quantity;


    /////// Problem ///////

    /**
     * You have a complex conditional (if-then/else or switch).
     */
    void testV1() {
        if (date.before(SUMMER_START) || date.after(SUMMER_END)) {
            charge = quantity * winterRate + winterServiceCharge;
        } else {
            charge = quantity * summerRate;
        }
    }

    /////// Solution ///////

    /**
     * Decompose the complicated parts of the conditional into separate methods: the condition, if then and else.
     */
    void testV2() {
        if (isSummer(date)) {
            charge = summerCharge(quantity);
        } else {
            charge = winterCharge(quantity);
        }
    }

    boolean isSummer(Date date) {
        return date.before(SUMMER_START) || date.after(SUMMER_END);
    }

    double summerCharge(double quantity) {
        return quantity * winterRate + winterServiceCharge;
    }

    double winterCharge(double quantity) {
        return quantity * summerRate;
    }
    /////////////////////
}

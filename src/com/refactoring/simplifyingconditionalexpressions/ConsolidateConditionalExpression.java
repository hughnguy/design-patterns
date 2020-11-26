package com.refactoring.simplifyingconditionalexpressions;

import com.refactoring.composingmethods.InlineTemp;

public class ConsolidateConditionalExpression {
    int seniority;
    int monthsDisabled;
    boolean isPartTime;

    /////// Problem ///////

    /**
     * You have multiple conditionals that lead to the same result or action.
     */
    double disabilityAmountV1() {
        if (seniority < 2) {
            return 0;
        }
        if (monthsDisabled > 12) {
            return 0;
        }
        if (isPartTime) {
            return 0;
        }
        // Compute the disability amount.
        // ...
        return 100;
    }

    /////// Solution ///////

    /**
     * Consolidate all these conditionals in a single expression.
     */
    double disabilityAmountV2() {
        if (isNotEligibleForDisability()) {
            return 0;
        }
        // Compute the disability amount.
        // ...
        return 100;
    }

    boolean isNotEligibleForDisability() {
        return (seniority < 2 || monthsDisabled > 12 || isPartTime);
    }

    /////////////////////
}

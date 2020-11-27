package com.refactoring.simplifyingconditionalexpressions;

public class ReplaceNestedConditionalsWithGuardClauses {

    boolean isDead;
    boolean isSeparated;
    boolean isRetired;

    /////// Problem ///////

    /**
     * You have a group of nested conditionals and it’s hard to determine the normal flow of code execution.
     */
    double testV1() {
        double result;
        if (isDead){
            result = deadAmount();
        } else {
            if (isSeparated){
                result = separatedAmount();
            }
            else {
                if (isRetired){
                    result = retiredAmount();
                }
                else{
                    result = normalPayAmount();
                }
            }
        }
        return result;
    }

    /////// Solution ///////

    /**
     * Isolate all special checks and edge cases into separate clauses and place them before the main checks.
     * Ideally, you should have a “flat” list of conditionals, one after the other.
     */
    double testV2() {
        if (isDead){
            return deadAmount();
        }
        if (isSeparated){
            return separatedAmount();
        }
        if (isRetired){
            return retiredAmount();
        }
        return normalPayAmount();
    }

    /////////////////////
    double deadAmount() {return 0;};
    double separatedAmount() {return 0;};
    double retiredAmount() {return 0;};
    double normalPayAmount() {return 0;};
}

package com.refactoring.simplifyingmethodcalls;

public class ReplaceErrorCodeWithException {
    int _balance;
    int balance;

    /////// Problem ///////

    /**
     * A method returns a special value that indicates an error?
     */
    int withdrawV1(int amount) {
        if (amount > _balance) {
            return -1;
        } else {
            balance -= amount;
            return 0;
        }
    }

    /////// Solution ///////

    /**
     * Throw an exception instead.
     */
    void withdrawV2(int amount) throws BalanceException {
        if (amount > _balance) {
            throw new BalanceException();
        }
        balance -= amount;
    }

    class BalanceException extends Exception {}

    /////////////////////
}

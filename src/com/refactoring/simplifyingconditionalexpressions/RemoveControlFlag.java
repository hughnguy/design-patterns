package com.refactoring.simplifyingconditionalexpressions;

public class RemoveControlFlag {

    /////// Problem ///////

    /**
     * You have a boolean variable that acts as a control flag for multiple boolean expressions.
     */
    void testV1(String[] people) {
        boolean found = false;
        for (int i = 0; i < people.length; i++) {
            if (!found) {
                if (people[i].equals ("Don")){
                    sendAlert();
                    found = true;
                }
            }
        }
    }

    /////// Solution ///////

    /**
     * Instead of the variable, use break, continue and return.
     */
    void testV2(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals ("Don")){
                sendAlert();
                break;
            }
        }
    }

    /////////////////////
    void sendAlert() {};
}

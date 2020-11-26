package com.refactoring.movingfeaturesbetweenobjects;

import java.util.Date;

public class IntroduceForeignMethod {

    Date previousEnd;

    /////// Problem ///////

    /**
     * A utility class doesn’t contain the method that you need and you can’t add the method to the class.
     */
    void sendReportV1() {
        Date nextDay = new Date(previousEnd.getYear(), previousEnd.getMonth(), previousEnd.getDate() + 1);
    }

    /////// Solution ///////

    /**
     * Add the method to a client class and pass an object of the utility class to it as an argument.
     */
    void sendReportV2() {
        Date newStart = nextDay(previousEnd);
    }

    private static Date nextDay(Date arg) {
        return new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
    }

    /////////////////////
}

package com.refactoring.movingfeaturesbetweenobjects;

import java.util.Date;

public class IntroduceLocalExtension {

    Date previousEnd;

    /////// Problem ///////

    /**
     * A utility class doesn’t contain some methods that you need. But you can’t add these methods to the class.
     */
    void sendReportV1() {
        Date nextDay = new Date(previousEnd.getYear(), previousEnd.getMonth(), previousEnd.getDate() + 1);
    }

    /////// Solution ///////

    /**
     * Create a new class containing the methods and make it either the child or wrapper of the utility class.
     */
    void sendReportV2() {
        Date newStart = MfDate.nextDay(previousEnd);
    }

    private static class MfDate extends Date {
        public static Date nextDay(Date arg) {
            return new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
        }
    }

    /////////////////////
}

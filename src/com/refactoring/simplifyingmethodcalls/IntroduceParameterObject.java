package com.refactoring.simplifyingmethodcalls;

import java.util.Date;

public class IntroduceParameterObject {

    /////// Problem ///////

    /**
     * Your methods contain a repeating group of parameters.
     */
    void amountInvoicedIn(Date start, Date end) {return;}
    void amountReceivedIn(Date start, Date end) {return;}
    void amountOverdueIn(Date start, Date end) {return;}

    /////// Solution ///////

    /**
     * Replace these parameters with an object.
     */
    void amountInvoicedIn(DateRange date) {return;}
    void amountReceivedIn(DateRange date) {return;}
    void amountOverdueIn(DateRange date) {return;}

    class DateRange {
        Date start;
        Date end;
    }

    /////////////////////
}

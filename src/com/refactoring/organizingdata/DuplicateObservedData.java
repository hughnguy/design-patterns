package com.refactoring.organizingdata;

public class DuplicateObservedData {

    /////// Problem ///////

    /**
     * Is domain data stored in classes responsible for the GUI?
     */
    class IntervalWindow { // GUI class which deals with rendering
        String startField;
        String endField;
        String lengthField;

        void startFieldFocusLost() {}
        void endFieldFocusLost() {}
        void lengthFieldFocusLost() {}
        void calculateLength() {}
        void calculateEnd() {}
    }

    /////// Solution ///////

    /**
     * Then it’s a good idea to separate the data into separate classes, ensuring connection and
     * synchronization between the domain class and the GUI.
     *
     *  If you fail to separate the GUI from the domain, you will have a very hard time avoiding code duplication
     *  and a large number of mistakes.
     *
     *  You split responsibility between business logic classes and presentation classes
     *  (cf. the Single Responsibility Principle), which makes your program more readable and understandable.
     */
    class IntervalWindow2 { // GUI class which deals with rendering
        Interval interval;

        String startField;
        String endField;
        String lengthField;

        void startFieldFocusLost() {}
        void endFieldFocusLost() {}
        void lengthFieldFocusLost() {}
    }

    class Interval { // domain class
        String start;
        String end;
        String length;

        void calculateLength() {}
        void calculateEnd() {}
    }


    /////////////////////
}

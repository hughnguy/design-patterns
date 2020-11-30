package com.refactoring.dealingwithgeneralization;

public class PullUpMethod {

    /////// Problem ///////

    /**
     * Your subclasses have methods that perform similar work.
     */
    class Unit {}

    class Soldier extends Unit {
        public int getHealth() {
            return 0;
        }
    }

    class Tank extends Unit {
        public int getHealth() {
            return 0;
        }
    }

    /////// Solution ///////

    /**
     * Make the methods identical and then move them to the relevant superclass.
     */
    class Unit2 {
        public int getHealth() {
            return 0;
        }
    }

    class Soldier2 extends Unit2 {}

    class Tank2 extends Unit2 {}

    /////////////////////
}

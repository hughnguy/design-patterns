package com.refactoring.dealingwithgeneralization;

public class PushDownMethod {

    /////// Problem ///////

    /**
     * Is behavior implemented in a superclass used by only one (or a few) subclasses?
     */
    class Unit {
        public void getFuel() {
            return;
        };
    }

    class Soldier extends Unit {
        public int getHealth() {
            return 0;
        }
    }

    class Tank extends Unit {
        public int getHealth() {
            getFuel();
            return 0;
        }
    }

    /////// Solution ///////

    /**
     * Move this behavior to the subclasses.
     */
    class Unit2 {}

    class Soldier2 extends Unit2 {
        public int getHealth() {
            return 0;
        }
    }

    class Tank2 extends Unit2 {
        public void getFuel() {
            return;
        };

        public int getHealth() {
            getFuel();
            return 0;
        }
    }

    /////////////////////
}

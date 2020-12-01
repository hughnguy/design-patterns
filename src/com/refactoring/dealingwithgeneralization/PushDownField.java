package com.refactoring.dealingwithgeneralization;

public class PushDownField {

    /////// Problem ///////

    /**
     * Is a field used only in a few subclasses?
     */
    class Unit {
        int fuel;
        int health;
    }

    class Soldier extends Unit {
        int getHealth() {
            return health;
        }
    }

    class Tank extends Unit {
        int getHealth() {
            return fuel;
        }
    }

    /////// Solution ///////

    /**
     * Move the field to these subclasses.
     */
    class Unit2 {
        int health;
    }

    class Soldier2 extends Unit2 {
        int getHealth() {
            return health;
        }
    }

    class Tank2 extends Unit2 {
        int fuel;

        int getHealth() {
            return fuel;
        }
    }

    /////////////////////
}

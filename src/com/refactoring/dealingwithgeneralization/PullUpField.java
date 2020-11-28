package com.refactoring.dealingwithgeneralization;

public class PullUpField {

    /////// Problem ///////

    /**
     * Two classes have the same field.
     */
    class Unit {}

    class Soldier extends Unit {
        int health;
    }

    class Tank extends Unit {
        int health;
    }

    /////// Solution ///////

    /**
     * Remove the field from subclasses and move it to the superclass.
     */
    class Unit2 {
        int health;
    }

    class Soldier2 extends Unit2 {}

    class Tank2 extends Unit2 {}

    /////////////////////

}

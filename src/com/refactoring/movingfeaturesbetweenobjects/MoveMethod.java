package com.refactoring.movingfeaturesbetweenobjects;

public class MoveMethod {

    /////// Problem ///////

    /**
     * A method is used more in another class than in its own class.
     */

    private class Dog {
        void jump() {}
        void woof() {
            System.out.println("woooof");
        }
    }

    private class Cat {
        Dog dog;

        void talk() {
            dog.woof();
        }

        void talk2() {
            dog.woof();
        }
    }

    /////// Solution ///////

    /**
     * Create a new method in the class that uses the method the most, then move code from the old method to there.
     * Turn the code of the original method into a reference to the new method in the other class or else remove it entirely.
     */

    private class Dog2 {
        void jump() {}
    }

    private class Cat2 {

        void woof() {
            System.out.println("woooof");
        }

        void talk() {
            woof();
        }

        void talk2() {
            woof();
        }
    }

    /////////////////////
}

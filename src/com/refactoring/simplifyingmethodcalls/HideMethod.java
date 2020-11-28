package com.refactoring.simplifyingmethodcalls;

public class HideMethod {

    /////// Problem ///////

    /**
     * A method isn’t used by other classes or is used only inside its own class hierarchy.
     */
    class Person {
        public void doSomething() {}
    }

    /////// Solution ///////

    /**
     * Make the method private or protected.
     */
    class Person2 {
        private void doSomething() {}
    }

    /////////////////////
}

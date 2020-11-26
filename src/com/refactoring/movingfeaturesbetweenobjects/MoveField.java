package com.refactoring.movingfeaturesbetweenobjects;

public class MoveField {

    /////// Problem ///////

    /**
     * A field is used more in another class than in its own class.
     */

    private class ApiClient {
        void request() {
            System.out.println(Url.ENDPOINT);
        }
        void request2() {
            System.out.println(Url.ENDPOINT);
        }
        void request3() {
            System.out.println(Url.ENDPOINT);
        }
    }

    private class Url {
        public final static String ENDPOINT = "endpoint";
    }

    /////// Solution ///////

    /**
     * Create a field in a new class and redirect all users of the old field to it.
     */

    private class ApiClient2 {
        public final static String ENDPOINT = "endpoint";
        void request() {
            System.out.println(Url.ENDPOINT);
        }
        void request2() {
            System.out.println(Url.ENDPOINT);
        }
        void request3() {
            System.out.println(Url.ENDPOINT);
        }
    }

    private class Url2 {}

    /////////////////////
}

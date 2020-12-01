package com.refactoring.dealingwithgeneralization;

import java.util.List;

public class ReplaceInheritanceWithDelegation {

    /////// Problem ///////

    /**
     * You have a subclass that uses only a portion of the methods of its superclass (or it’s not possible to inherit superclass data).
     */
    abstract class Vector {
        private List<Integer> list;
        abstract boolean isEmpty();
    }

    class Stack extends Vector {
        @Override
        boolean isEmpty() {
            /**
             * Cannot access list object in super class
             */
//            return list.isEmpty();
            return true;
        }
    }

    /////// Solution ///////

    /**
     * Create a field and put a superclass object in it, delegate methods to the superclass object, and get rid of inheritance.
     */
    class Stack2 {
        Vector vector;

        boolean isEmpty() {
            return vector.isEmpty();
        }
    }

    /////////////////////
}

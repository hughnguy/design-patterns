package com.refactoring.composingmethods;

import java.util.Arrays;
import java.util.List;

public class SubstituteAlgorithm {

    /////// Problem ///////

    /**
     * So you want to replace an existing algorithm with a new one?
     */
    String foundPersonV1(String[] people) {
        for(int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")){
                return "Don";
            }
            if (people[i].equals("John")){
                return "John";
            }
            if (people[i].equals("Kent")){
                return "Kent";
            }
        }
        return "";
    }

    /////// Solution ///////

    /**
     * Replace the body of the method that implements the algorithm with a new algorithm.
     *
     * Gradual refactoring isn’t the only method for improving a program. Sometimes a method is so cluttered with issues
     * that it’s easier to tear down the method and start fresh. And perhaps you have found an algorithm
     * that’s much simpler and more efficient. If this is the case, you should simply replace
     * the old algorithm with the new one.
     */
    String foundPersonV2(String[] people) {
        List candidates = Arrays.asList(new String[] {"Don", "John", "Kent"});
        for (int i=0; i < people.length; i++) {
            if (candidates.contains(people[i])) {
                return people[i];
            }
        }
        return "";
    }

    /////////////////////
}

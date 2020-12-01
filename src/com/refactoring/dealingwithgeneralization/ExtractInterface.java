package com.refactoring.dealingwithgeneralization;

public class ExtractInterface {

    /////// Problem ///////

    /**
     * Multiple clients are using the same part of a class interface. Another case: part of the interface in two classes is the same.
     */
    class Employee {
        int getRate() {
            return 0;
        }
        boolean hasSpecialSkill() {
            return true;
        }
        String getName() {
            return null;
        }
        String getDepartment() {
            return null;
        }
    }

    /////// Solution ///////

    /**
     * Move this identical portion to its own interface.
     */
    interface Billable {
        int getRate();
        boolean hasSpecialSkill();
    }

    class Employee2 implements Billable {
        @Override
        public int getRate() {
            return 0;
        }

        @Override
        public boolean hasSpecialSkill() {
            return false;
        }
        String getName() {
            return null;
        }
        String getDepartment() {
            return null;
        }
    }

    /////////////////////

}

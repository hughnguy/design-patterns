package com.refactoring.simplifyingconditionalexpressions;

public class IntroduceNullObject {
    BillingPlan plan;
    Customer customer;
    NullCustomer customer2;
    NullPlan plan2;

    class BillingPlan {
        void basic() {
            System.out.println("hiyyyyyyaaaaaaa");
        }
    }

    class Customer {
        BillingPlan getPlan() {
            return null;
        }
    }

    /////// Problem ///////

    /**
     * Since some methods return null instead of real objects, you have many checks for null in your code.
     */
    void testV1() {
        plan = customer.getPlan();
        if(plan != null) {
            plan.basic();
        }
    }

    /////// Solution ///////

    /**
     * Instead of null, return a null object that exhibits the default behavior.
     */
    void testV2() {
        plan2 = customer2.getPlan();
        plan2.basic();
    }

    class NullCustomer extends Customer {
        NullPlan getPlan() {
            return new NullPlan();
        }
    }

    class NullPlan extends BillingPlan {
        void basic() {}
    }
    /////////////////////
}

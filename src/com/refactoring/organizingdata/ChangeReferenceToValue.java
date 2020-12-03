package com.refactoring.organizingdata;

public class ChangeReferenceToValue {

    /////// Problem ///////

    /**
     * You have a reference object that’s too small and infrequently changed to justify managing its life cycle.
     */
    static void testV1() {
        // Customer object is immutable so no benefits of returning a reference (same instance)

        Customer customer = CustomerRepo.get(1); // get reference object
        Customer sameCustomer = CustomerRepo.get(1); // get reference object
    }

    /////// Solution ///////

    /**
     * Turn it into a value object.
     */
    static void testV2() {
        // Returns a new object each time, instead of reference to same object

        Customer customer = CustomerRepo2.get(1);
        Customer sameCustomer = CustomerRepo2.get(1);
    }

    /////////////////////


    static class Customer {
        private int id;
        private String name;

        Customer(int id) {
            this.id = id;
            this.name = Integer.toString(id);
        }

        String getName() {
            return name;
        }
    }

    // Returns reference
    static class CustomerRepo {
        static Customer customer1;

        static Customer get(int id) {
            if(id == 1) {
                if(customer1 == null) {
                    customer1 = new Customer(1);
                }
                return customer1;
            }
            return null;
        }
    }

    // Returns new value
    static class CustomerRepo2 {
        static Customer get(int id) {
            if(id == 1) {
                return new Customer(1);
            }
            return null;
        }
    }
}

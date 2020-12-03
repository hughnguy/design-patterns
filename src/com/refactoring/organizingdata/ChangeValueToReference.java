package com.refactoring.organizingdata;

public class ChangeValueToReference {

    /////// Problem ///////

    /**
     * So you have many identical instances of a single class that you need to replace with a single object.
     */
    static void testV1() {
        Customer customer = new Customer(1);
        Customer sameCustomer = new Customer(1);
        customer.setName("Doug"); // this does not update all references. only this instance
        System.out.println(sameCustomer.getName()); // does not return Doug
    }

    /////// Solution ///////

    /**
     * Convert the identical objects to a single reference object.
     */
    static void testV2() {
        Customer customer = CustomerRepo.get(1); // get reference object
        Customer sameCustomer = CustomerRepo.get(1); // get reference object
        customer.setName("Doug");

        System.out.println(sameCustomer.getName()); // returns Doug since updating reference
    }

    /////////////////////


    static class Customer {
        int id;
        String name;

        Customer(int id) {
            this.id = id;
        }

        String getName() {
            return name;
        }

        void setName(String name) {
            this.name = name;
        }
    }

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

    public static void main(String[] args) {
        testV1();
        testV2();
    }
}

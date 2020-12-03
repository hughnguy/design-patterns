package com.refactoring.organizingdata;

import java.util.Collections;
import java.util.Set;

public class ReplaceTypeCodeWithClass {

    /////// Problem ///////

    /**
     * A class has a field that contains type code. The values of this type aren’t used in operator
     * conditions and don’t affect the behavior of the program.
     */
    class Person {
        // These are type code
        public static final int O = 0;
        public static final int A = 1;
        public static final int B = 2;
        public static final int AB = 3;

        private int bloodGroup;

        public Person(int bloodGroup) {
            this.bloodGroup = bloodGroup;
        }

        public void setBloodGroup(int bloodGroup) {
            this.bloodGroup = bloodGroup; // other integers can be passed in which arent part of blood group!!!
        }
    }

    /////// Solution ///////

    /**
     * Create a new class and use its objects instead of the type code values.
     *
     * Alternatively, you can also use ENUMS
     */
    class Person2 {
        BloodGroup bloodGroup;

        Person2(BloodGroup bloodGroup) {
            this.bloodGroup = bloodGroup;
        }

        Person2 createOPerson() {
            return new Person2(BloodGroup.O);
        }
    }

    static class BloodGroup {
        public static final BloodGroup O = new BloodGroup(0);
        public static final BloodGroup A = new BloodGroup(1);
        public static final BloodGroup B = new BloodGroup(2);
        public static final BloodGroup AB = new BloodGroup(3);

        private final int code;

        private BloodGroup(int code) { // private method so cannot create outside
            this.code = code;
        }
        public int getCode() {
            return code;
        }
    }

    /////////////////////
}

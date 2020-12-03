package com.refactoring.organizingdata;

import java.util.Collections;
import java.util.Set;

public class EncapsulateCollection {

    /////// Problem ///////

    /**
     * A class contains a collection field and a simple getter and setter for working with the collection.
     */
    class Person {
        Set courses;

        Set getCourses() {
            return courses;
        }

        void setCourses(Set courses) {
            this.courses = courses;
        }
    }

    /////// Solution ///////

    /**
     * Make the getter-returned value read-only and create methods for adding/deleting elements of the collection.
     */
    class Person2 {
        Set courses;

        Set getCourses() { // returns immutable read only
            return Collections.unmodifiableSet(courses);
        }

        void addCourse(Object course) {
            courses.add(course);
        }

        void removeCourse(Object course) {
            courses.remove(course);
        }
    }

    /////////////////////
}

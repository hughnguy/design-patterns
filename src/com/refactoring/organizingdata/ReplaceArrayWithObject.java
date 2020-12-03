package com.refactoring.organizingdata;

public class ReplaceArrayWithObject {

    /////// Problem ///////

    /**
     * You have an array that contains various types of data.
     */
    void testV1() {
        String[] row = new String[2];
        row[0] = "Liverpool";
        row[1] = "15";
    }

    /////// Solution ///////

    /**
     * Replace the array with an object that will have separate fields for each element.
     */
    void testV2() {
        Performance row = new Performance();
        row.setName("Liverpool");
        row.setWins("15");
    }

    /////////////////////

    class Performance {
        String name;
        String wins;
        void setName(String name) {
            this.name = name;
        }
        void setWins(String wins) {
            this.wins = wins;
        }
    }
}
